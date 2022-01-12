public android.content.res.AssetManager getAssetsByBundle(java.lang.String bundleName) {
    com.dynamicload.framework.dynamicload.internal.DLPluginPackage dlPluginPackage = getPluginPackageByBundle(bundleName);
    if (dlPluginPackage == null) {
        return null;
    }
    return dlPluginPackage.assetManager;
}