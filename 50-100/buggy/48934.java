public org.apache.zeppelin.helium.HeliumPackageSearchResult getEnabledPackageInfo(java.lang.String packageName) {
    java.util.Map<java.lang.String, java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult>> infos = getAllPackageInfoWithoutRefresh();
    java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> packages = infos.get(packageName);
    for (org.apache.zeppelin.helium.HeliumPackageSearchResult pkgSearchResult : packages) {
        if (pkgSearchResult.isEnabled()) {
            return pkgSearchResult;
        }
    }
    return null;
}