public static java.lang.String getPathOfJAR(java.lang.Object any) {
    java.lang.String jarPath = any.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
    return jarPath.substring(0, ((jarPath.lastIndexOf('/')) + 1));
}