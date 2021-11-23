public static java.lang.String bootstrapApp() {
    java.io.File bootstrapFile = com.tns.Require.findModuleFile("./", "");
    if (!(bootstrapFile.exists())) {
        bootstrapFile = com.tns.Require.findModuleFile("./bootstrap", "");
    }
    if (!(bootstrapFile.exists())) {
        com.tns.Platform.APP_FAIL(null, "Application entry point file not found. Please specify either package.json with main field, index.js or bootstrap.js!");
    }
    java.lang.String modulePath = bootstrapFile.getAbsolutePath();
    return modulePath;
}