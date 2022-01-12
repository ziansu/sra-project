public static java.util.Set<org.talend.hadoop.distribution.DistributionModuleGroup> getModuleGroups() {
    java.util.Set<org.talend.hadoop.distribution.DistributionModuleGroup> hs = new java.util.HashSet<>();
    hs.add(new org.talend.hadoop.distribution.DistributionModuleGroup(HDInsight36Constant.SPARK_HIVE_MRREQUIRED_MODULE_GROUP.getModuleName(), false, null));
    hs.add(new org.talend.hadoop.distribution.DistributionModuleGroup(HDInsight36Constant.SPARK_SQL_MRREQUIRED_MODULE_GROUP.getModuleName(), false, null));
    return hs;
}