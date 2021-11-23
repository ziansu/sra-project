protected boolean isExcluded(java.lang.String name) {
    if (this.excludedClasses.contains(name)) {
        return true;
    }
    for (java.lang.String packageName : this.excludedPackages) {
        if (name.startsWith(packageName)) {
            return true;
        }
    }
    return false;
}