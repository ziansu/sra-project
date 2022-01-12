@java.lang.Override
public void deleteByUidAndUserId(java.lang.String deviceUid, java.lang.String userId, java.lang.String domainId) {
    java.lang.String deviceId = io.corbel.iam.utils.UserDomainIdGenerator.generateDeviceId(domainId, userId, deviceUid);
    long result = deviceRepository.deleteById(deviceId);
    if (result > 0) {
        eventsService.sendDeviceDeleteEvent(deviceId, userId, domainId);
    }
}