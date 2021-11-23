private java.lang.String addPackage(java.lang.String initialPackageList, java.lang.String packageToAdd) {
    if (initialPackageList == null) {
        return packageToAdd;
    }
    if (!(java.util.Arrays.asList(initialPackageList.split(",")).contains(packageToAdd))) {
        if (initialPackageList.isEmpty()) {
            return packageToAdd;
        }else {
            return (initialPackageList + ",\n ") + packageToAdd;
        }
    }else {
        return initialPackageList;
    }
}