@java.lang.Override
public boolean apply(com.thoughtworks.fam.domain.Asset asset) {
    for (com.thoughtworks.fam.domain.Asset userAsset : userAssets) {
        if (!(userAsset.getAssetNumber().equals(asset.getAssetNumber()))) {
            return true;
        }
    }
    return false;
}