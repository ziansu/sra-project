@java.lang.Override
java.util.List<ly.kite.catalogue.Asset> getAssetsForUploading() {
    java.util.ArrayList<ly.kite.catalogue.Asset> assets = new java.util.ArrayList<ly.kite.catalogue.Asset>();
    if ((mFrontImageAsset) != null)
        assets.add(mFrontImageAsset);
    
    if ((mBackImageAsset) != null)
        assets.add(mBackImageAsset);
    
    if ((mInsideLeftImageAsset) != null)
        assets.add(mInsideLeftImageAsset);
    
    if ((mInsideRightImageAsset) != null)
        assets.add(mInsideRightImageAsset);
    
    return assets;
}