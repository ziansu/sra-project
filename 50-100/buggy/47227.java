@org.springframework.scheduling.annotation.Scheduled(fixedRate = 300000)
public void reactivateMutedUsers() throws java.lang.Exception {
    za.org.grassroot.messaging.service.mqtt.GroupChatServiceImpl.logger.info("Reactivating muted group users ...");
    java.util.List<za.org.grassroot.core.domain.GroupChatSettings> groupChatSettingses = groupChatSettingsRepository.findByActiveFalseAndUserInitiatedFalseAndReactivationTimeBefore(java.time.Instant.now());
    for (za.org.grassroot.core.domain.GroupChatSettings messengerSetting : groupChatSettingses) {
        java.lang.String userUid = messengerSetting.getUser().getUid();
        java.lang.String groupUid = messengerSetting.getGroup().getUid();
        try {
            updateActivityStatus(userUid, groupUid, true, false);
        } catch (java.lang.IllegalArgumentException e) {
            za.org.grassroot.messaging.service.mqtt.GroupChatServiceImpl.logger.error(("Error while trying un-mute user with " + userUid));
        }
    }
}