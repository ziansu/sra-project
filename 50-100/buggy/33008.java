private static void readProperties(java.lang.String configFile) throws java.io.IOException {
    java.lang.String filePath = ("configs/" + configFile) + ".properties";
    java.io.InputStream inputStream;
    java.util.Properties newProps = new java.util.Properties();
    inputStream = Framework.Config.class.getClassLoader().getResourceAsStream(filePath);
    newProps.load(inputStream);
    Framework.Config.props.put(configFile, newProps);
}