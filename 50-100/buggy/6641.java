@java.lang.Override
java.util.List<ly.kite.catalogue.Asset> getAssetsForUploading() {
    java.util.ArrayList<ly.kite.catalogue.Asset> assets = new java.util.ArrayList<ly.kite.catalogue.Asset>();
    assets.add(mFrontImageAsset);
    assets.add(mBackImageAsset);
    assets.add(mInsideLeftImageAsset);
    assets.add(mInsideRightImageAsset);
    return assets;
}