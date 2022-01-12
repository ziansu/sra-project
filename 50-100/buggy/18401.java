private boolean matchesAsset(net.nikr.eve.jeveasset.gui.tabs.assets.MyAsset asset, boolean add) {
    return (asset != null) && (matches(add, (isBPC() ? -(asset.getItem().getTypeID()) : asset.getItem().getTypeID()), asset.getOwnerID(), asset.getContainer(), null, asset.getLocation(), asset, null, null, null, null));
}