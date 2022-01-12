@java.lang.Override
public boolean unassignPermissionFromResources(java.lang.String policyId) {
    java.lang.String[] policyIds = policyId.split(":");
    logger.info("Unassign submit/admin permission to yarn queue.");
    boolean yarnPolicyDeleted = this.yarnCommonService.unassignPermissionFromQueue(policyIds[0]);
    logger.info("Unassign read/write/execute permission to hdfs folder.");
    boolean hdfsPolicyDeleted = this.hdfsAdminService.unassignPermissionFromResources(policyIds[1]);
    return yarnPolicyDeleted && hdfsPolicyDeleted;
}