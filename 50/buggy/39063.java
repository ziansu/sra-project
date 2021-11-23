private static void checkIfConfigFileExisted() {
    java.io.File f = new java.io.File("setting.xml");
    if (!((f.exists()) && (!(f.isDirectory())))) {
        helper.ConfigHandler.createConfigFile();
    }
}