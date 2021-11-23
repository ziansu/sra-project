private boolean allowed(java.lang.Package p) {
    if (org.gradle.util.FilteringClassLoader.SYSTEM_PACKAGES.contains(p.getName())) {
        return true;
    }
    if (packageNames.contains(p.getName())) {
        return true;
    }
    for (java.lang.String packagePrefix : packagePrefixes) {
        if (p.getName().startsWith(packagePrefix)) {
            return true;
        }
    }
    return false;
}