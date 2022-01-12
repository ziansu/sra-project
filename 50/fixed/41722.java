private boolean canBundle(org.apache.zeppelin.helium.HeliumPackageSearchResult pkgInfo) {
    return (pkgInfo.isEnabled()) && (org.apache.zeppelin.helium.HeliumPackage.isBundleType(pkgInfo.getPkg().getType()));
}