static java.util.Properties load(java.lang.String fileName) throws java.io.IOException {
    java.util.Properties props = new java.util.Properties();
    java.io.File propsFile = new java.io.File("import.properties");
    if (propsFile.exists()) {
        java.io.InputStreamReader in = new java.io.InputStreamReader(new java.io.FileInputStream("import.properties"), "UTF-8");
        props.load(in);
        in.close();
    }
    return props;
}