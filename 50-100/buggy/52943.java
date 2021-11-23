private boolean auth(java.lang.String user_password) throws java.io.IOException {
    java.util.Properties prop = new java.util.Properties();
    java.io.InputStream input;
    input = new java.io.FileInputStream("config.properties");
    prop.load(input);
    if (prop.getProperty("password").equals(user_password)) {
        return true;
    }
    return false;
}