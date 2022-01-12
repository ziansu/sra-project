private boolean allowed(java.lang.Package p) {
    if (org.gradle.util.FilteringClassLoader.SYSTEM_PACKAGES.contains(p)) {
        return true;
    }
    for (java.lang.String packageName : packageNames) {
        if (p.getName().equals(packageName)) {
            return true;
        }
    }
    for (java.lang.String packagePrefix : packagePrefixes) {
        if (p.getName().startsWith(packagePrefix)) {
            return true;
        }
    }
    return false;
}