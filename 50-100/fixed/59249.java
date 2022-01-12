private static synchronized java.util.Properties getProp() {
    try {
        if ((eu.arrowhead.common.DatabaseManager.prop) == null) {
            eu.arrowhead.common.DatabaseManager.prop = new java.util.Properties();
            java.io.File file = new java.io.File((("config" + (java.io.File.separator)) + "app.properties"));
            java.io.FileInputStream inputStream = new java.io.FileInputStream(file);
            eu.arrowhead.common.DatabaseManager.prop.load(inputStream);
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return eu.arrowhead.common.DatabaseManager.prop;
}