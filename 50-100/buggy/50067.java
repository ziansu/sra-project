public static java.io.File getPropertiesFile() {
    if ((org.pageseeder.berlioz.GlobalSettings.repository) == null)
        return null;
    
    java.io.File dir = new java.io.File(org.pageseeder.berlioz.GlobalSettings.repository, org.pageseeder.berlioz.GlobalSettings.CONFIG_DIRECTORY);
    java.io.File f = org.pageseeder.berlioz.GlobalSettings.getModeConfigFile(dir);
    if (f == null) {
        f = org.pageseeder.berlioz.GlobalSettings.getDefaultConfigFile(dir);
    }
    return null;
}