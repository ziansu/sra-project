protected boolean isExcluded(java.lang.String className) {
    if (this.excludedClasses.contains(className)) {
        return true;
    }
    for (java.lang.String packageName : this.excludedPackages) {
        if (className.startsWith(packageName)) {
            return true;
        }
    }
    return false;
}