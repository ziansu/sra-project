public void validatePackages() {
    for (io.resource.DataPackage dataPackage : packageList) {
        dataPackage.applyChanges(this);
    }
}