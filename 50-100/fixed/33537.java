@java.lang.Override
public void deserialize(net.rpgtoolkit.common.assets.AssetHandle handle) throws java.io.IOException, net.rpgtoolkit.common.assets.AssetException {
    org.json.JSONObject json = load(handle);
    final net.rpgtoolkit.common.assets.Board asset = new net.rpgtoolkit.common.assets.Board(new java.io.File(handle.getDescriptor().getURI()));
    harvestJSON(json, asset);
    handle.setAsset(asset);
}