@java.lang.Override
public boolean unassignPermissionFromResources(java.lang.String policyId) {
    java.lang.String[] policyIds = policyId.split(":");
    logger.info("Unassign submit/admin permission to yarn queue.");
    boolean yarnPolicyDeleted = this.yarnCommonService.unassignPermissionFromQueue(policyIds[0]);
    logger.info("Unassign select/update/create/drop/alter/index/lock/all permission to hive database.");
    boolean hivePolicyDeleted = this.hiveCommonService.unassignPermissionFromDatabase(policyIds[1]);
    logger.info("Unassign read/write/execute permission to hdfs folder.");
    boolean hdfsPolicyDeleted = this.hdfsAdminService.unassignPermissionFromResources(policyIds[2]);
    return (yarnPolicyDeleted && hivePolicyDeleted) && hdfsPolicyDeleted;
}