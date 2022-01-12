public static java.lang.String getPathOfJAR(java.lang.Class any) {
    java.lang.String jarPath = any.getProtectionDomain().getCodeSource().getLocation().getPath();
    return jarPath.substring(0, ((jarPath.lastIndexOf('/')) + 1));
}