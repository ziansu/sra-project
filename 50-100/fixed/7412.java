@java.lang.Override
public void readConfiguration(java.io.InputStream ins) throws java.io.IOException, java.lang.SecurityException {
    java.util.Properties properties = new java.util.Properties();
    properties.load(ins);
    properties.forEach(( k, v) -> {
        java.lang.String val = substituteVariables(((java.lang.String) (v)));
        properties.setProperty(((java.lang.String) (k)), val);
    });
    super.readConfiguration(propertiesToInputStream(properties));
}