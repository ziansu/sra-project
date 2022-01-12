@java.lang.Override
public boolean removeUserFromResourcePermission(java.lang.String policyId, java.lang.String groupName, java.lang.String accountName) {
    java.lang.String[] policyIds = policyId.split(":");
    boolean userRemovedFromYarnPolicy = this.yarnCommonService.removeUserFromQueuePermission(policyIds[0], groupName, accountName);
    boolean userRemovedFromHivePolicy = this.hiveCommonService.removeUserFromDatabasePermission(policyIds[1], groupName, accountName);
    boolean userRemovedFromHDFSPolicy = this.hdfsAdminService.removeUserFromResourcePermission(policyIds[2], groupName, accountName);
    return (userRemovedFromYarnPolicy && userRemovedFromHivePolicy) && userRemovedFromHDFSPolicy;
}