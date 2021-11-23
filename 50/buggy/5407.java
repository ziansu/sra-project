public static boolean isAndroid(java.lang.String vmName) {
    java.lang.String lowerVMName = vmName.toLowerCase();
    return (lowerVMName.contains("dalvik")) || (lowerVMName.contains("lemur"));
}