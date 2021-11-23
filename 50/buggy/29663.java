public static void setWebInf(java.io.File dir) {
    org.pageseeder.berlioz.GlobalSettings.checkDirectoryExists(dir);
    org.pageseeder.berlioz.GlobalSettings.webInf = dir;
    if ((org.pageseeder.berlioz.GlobalSettings.appData) != null) {
        org.pageseeder.berlioz.GlobalSettings.appData = org.pageseeder.berlioz.GlobalSettings.webInf;
    }
}