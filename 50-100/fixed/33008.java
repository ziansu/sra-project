private static void readProperties(java.lang.String configFile) throws java.io.IOException {
    java.io.FileInputStream file;
    java.lang.String filePath = ("configs/" + configFile) + ".properties";
    file = new java.io.FileInputStream(filePath);
    java.util.Properties newProps = new java.util.Properties();
    newProps.load(file);
    Framework.Config.props.put(configFile, newProps);
}