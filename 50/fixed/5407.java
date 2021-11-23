public static boolean isAndroid(java.lang.String vmName) {
    if (vmName == null) {
        return false;
    }
    java.lang.String lowerVMName = vmName.toLowerCase();
    return (lowerVMName.contains("dalvik")) || (lowerVMName.contains("lemur"));
}