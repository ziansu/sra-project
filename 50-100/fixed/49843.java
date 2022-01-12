private static void readProperties() {
    if ((com.google.commons.TestProperties.props) != null) {
        return ;
    }
    com.google.commons.TestProperties.props = new java.util.Properties();
    try (java.io.InputStream myIs = com.google.commons.TestProperties.class.getResourceAsStream("/config/config.properties")) {
        com.google.commons.TestProperties.props.load(myIs);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}