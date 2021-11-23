public static java.lang.String[] getHiveServersDisplay(java.lang.String hiveDistribution, java.lang.String hiveVersion, java.lang.String hiveMode, boolean byDisplay) {
    java.util.List<java.lang.String> hiveServerItems = new java.util.ArrayList<java.lang.String>();
    if (org.talend.core.runtime.hd.hive.HiveMetadataHelper.doSupportHive1(hiveDistribution, hiveVersion, byDisplay)) {
        hiveServerItems.add(HiveServerVersionInfo.HIVE_SERVER_1.getDisplayName());
    }
    if (org.talend.core.runtime.hd.hive.HiveMetadataHelper.doSupportHive2(hiveDistribution, hiveVersion, byDisplay)) {
        hiveServerItems.add(HiveServerVersionInfo.HIVE_SERVER_2.getDisplayName());
    }
    return hiveServerItems.toArray(new java.lang.String[0]);
}