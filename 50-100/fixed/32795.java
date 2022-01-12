public io.resource.DataPackage getPackageForResource(core.world.WorldResource resource) {
    if (resource == null) {
        return null;
    }
    final java.lang.String packageID = resource.getPackageId();
    final io.resource.DataPackage[] plugins = getDataPackages();
    for (io.resource.DataPackage pack : plugins) {
        if (packageID != null) {
            if (pack.getReferenceId().equalsIgnoreCase(packageID)) {
                return pack;
            }
        }
    }
    return null;
}