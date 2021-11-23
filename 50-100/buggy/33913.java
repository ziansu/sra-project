public java.awt.image.BufferedImage getPlayerAsset(int index, int i) {
    assert (index >= 0) && (index < (_player_assets.length)) : "Invalid Index.";
    assert (i >= 0) && (i < (_player_assets[i].length)) : "Invalid Index.";
    return _player_assets[index][i];
}