public static java.lang.String getDefaultText(java.lang.String defaultName) {
    final java.lang.String path = (com.hp.mercury.ci.jenkins.plugins.downstreamlogs.table.StringProvider.DefaultStringProvider.DEFAULTS_PATH) + defaultName;
    java.lang.String text;
    try {
        text = new java.util.Scanner(com.hp.mercury.ci.jenkins.plugins.downstreamlogs.table.StringProvider.DefaultStringProvider.class.getClassLoader().getResourceAsStream(path)).useDelimiter("\\Z").next();
    } catch (java.lang.Exception e) {
        text = e.getMessage();
        com.hp.mercury.ci.jenkins.plugins.downstreamlogs.Log.throwing("DefaultStringProvider", "getDefaultText", e);
    }
    return text;
}