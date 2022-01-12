@java.lang.Override
public za.org.grassroot.services.Group saveGroup(za.org.grassroot.services.Group groupToSave, boolean createGroupLog, java.lang.String description, java.lang.Long changedByuserId) {
    za.org.grassroot.services.Group group = groupRepository.save(groupToSave);
    if (createGroupLog) {
        za.org.grassroot.services.GroupLog groupLog = groupLogRepository.save(new za.org.grassroot.services.GroupLog(groupToSave.getId(), dontKnowTheUser, za.org.grassroot.core.enums.GroupLogType.GROUP_UPDATED, changedByuserId, description));
    }
    return group;
}