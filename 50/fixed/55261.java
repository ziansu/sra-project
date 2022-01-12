public static void syncChecks() throws com.parse.ParseException {
    java.util.List<com.xizz.scoreoflife.object.EventCheck> checks = com.xizz.scoreoflife.util.Data.getAllCloudChecks();
    com.parse.ParseObject.unpinAll(EventCheck.CLASS_NAME);
    com.parse.ParseObject.pinAll(checks);
}