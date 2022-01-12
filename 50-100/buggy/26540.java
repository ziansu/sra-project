private static boolean isSupportStandalone(org.talend.core.model.metadata.connection.hive.HiveConnVersionInfo hiveVersionObj, int hiveServerIndex) {
    boolean isHiveServer1 = "HIVE".equals(org.talend.core.model.metadata.connection.hive.HiveServerVersionUtils.extractKey(hiveServerIndex));
    if (isHiveServer1 && (HiveConnVersionInfo.Cloudera_CDH5_4.equals(hiveVersionObj))) {
        return false;
    }
    return !((HiveConnVersionInfo.HDP_1_0.equals(hiveVersionObj)) || (isHiveServer1 && (((HiveConnVersionInfo.HDP_1_2.equals(hiveVersionObj)) || (HiveConnVersionInfo.HDP_1_3.equals(hiveVersionObj))) || (HiveConnVersionInfo.HDP_2_0.equals(hiveVersionObj)))));
}