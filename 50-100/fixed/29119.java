public static java.util.Properties getAuthentication(final boolean gui) {
    java.util.Properties properties = new java.util.Properties();
    try {
        properties.load(new java.io.FileInputStream(new java.io.File(com.redmine.easy.LoginUtil.TEMP_FILE)));
    } catch (java.lang.Exception e) {
    }
    if ((properties.getProperty("url")) != null) {
        java.lang.System.setProperty("easy.url", properties.getProperty("url"));
    }
    if ((properties.isEmpty()) && (!gui)) {
        return com.redmine.easy.LoginUtil.askUserInput();
    }
    return properties;
}