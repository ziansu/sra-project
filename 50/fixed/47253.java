public static boolean hasPattern(java.util.Collection<java.lang.String> paths) {
    return org.osgl.util.S.join("", paths).contains("*");
}