private void handleAssetSelecting(android.content.Intent data, pg.autyzm.friendly_plans.asset.AssetType assetType) {
    android.content.Context context = getActivity().getApplicationContext();
    java.lang.String filePath = filePickerProxy.getFilePath(data);
    this.pathToFile = filePath;
    pg.autyzm.friendly_plans.asset.AssetsHelper assetsHelper = new pg.autyzm.friendly_plans.asset.AssetsHelper(context);
    try {
        java.lang.String assetName = assetsHelper.makeSafeCopy(filePath);
        java.lang.Long assetId = assetRepository.create(pg.autyzm.friendly_plans.asset.AssetType.getTypeByExtension(assetName), assetName);
        setAssetValue(assetType, assetName, assetId);
    } catch (java.io.IOException e) {
        showToastMessage(R.string.picking_file_error);
    }
}