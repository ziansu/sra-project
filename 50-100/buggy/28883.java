public static java.lang.String getProperty(java.lang.String name, java.lang.String def) {
    java.lang.ClassLoader loader = network.NetworkConfiguration.class.getClassLoader();
    java.io.InputStream fs = loader.getResourceAsStream(network.NetworkConfiguration.resourceFile);
    java.io.FileReader reader = null;
    try {
        java.util.Properties networkProperties = new java.util.Properties();
        networkProperties.load(fs);
        java.lang.String val = networkProperties.getProperty(name);
        return val;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Exception while Reading properties file");
        e.printStackTrace();
    }
    return def;
}