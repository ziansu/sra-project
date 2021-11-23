public static void saveProperties() {
    if ((com.mailroom.mainclient.MainFrame.properties) != null) {
        com.mailroom.common.utils.Logger.logEvent("Saving Properties", "SYSTEM");
        try {
            java.io.File propFile = new java.io.File("./configuration.properties");
            if (!(propFile.exists())) {
                if (propFile.createNewFile()) {
                    java.io.FileOutputStream oStream = new java.io.FileOutputStream(propFile);
                    com.mailroom.mainclient.MainFrame.properties.store(oStream, "System Configuration");
                    oStream.close();
                }
            }
        } catch (java.io.IOException e) {
            com.mailroom.common.utils.Logger.logException(e);
        }
    }
}