public void validatePackages() {
    for (int i = 0; i < (packageList.size()); i++) {
        final io.resource.DataPackage dataPackage = packageList.get(i);
        dataPackage.applyChanges(this);
    }
}