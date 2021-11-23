private static java.lang.String getOsName() {
    if ((CMB.OS) == null) {
        CMB.OS = java.lang.System.getProperty("os.name");
    }
    return CMB.OS;
}