void setViewForVAddAsset() {
    com.ets.gd.FireBug.ViewInformation.AssetLocationFragment.spLocation.setEnabled(true);
    com.ets.gd.FireBug.ViewInformation.AssetLocationFragment.spLocation.setSelection(0);
    com.ets.gd.FireBug.ViewInformation.AssetLocationFragment.tvDescprition.setText("No location selected");
    spSite.setEnabled(false);
    spBuilding.setEnabled(false);
    com.ets.gd.FireBug.ViewInformation.AssetLocationFragment.spCustomer.setEnabled(false);
}