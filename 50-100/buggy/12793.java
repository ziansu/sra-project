public void enable(java.lang.String name, java.lang.String artifact) throws java.io.IOException {
    org.apache.zeppelin.helium.HeliumPackageSearchResult pkgInfo = getPackageInfo(name, artifact);
    if (pkgInfo == null) {
        return ;
    }
    if (org.apache.zeppelin.helium.HeliumPackage.isBundleType(pkgInfo.getPkg().getType())) {
        bundleFactory.buildPackage(pkgInfo.getPkg(), true);
    }
    heliumConf.enablePackage(name, artifact);
    save();
}