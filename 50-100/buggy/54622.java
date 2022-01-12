private static java.util.Properties initialInstance() {
    try {
        java.util.Properties prop = new java.util.Properties();
        java.io.InputStream input = th.co.gosoft.go10.util.PropertiesUtils.class.getClassLoader().getResourceAsStream("config.properties");
        prop.load(input);
        return prop;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}