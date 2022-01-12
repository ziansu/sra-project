private void textureClearButtonActionPerformed(java.awt.event.ActionEvent evt) {
    edu.oregonstate.carto.mapcomposer.Layer layer = getSelectedMapLayer();
    if (layer != null) {
        try {
            layer.setTextureTileFilePath(null);
        } catch (java.io.IOException ex) {
        }
    }
    writeGUI();
    addUndo("Clear Texture");
}