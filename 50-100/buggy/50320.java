private void moveUpLayerButtonActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedLayerID = layerList.getSelectedIndex();
    if (selectedLayerID <= 0) {
        return ;
    }
    edu.oregonstate.carto.mapcomposer.Layer layer = map.removeLayer(selectedLayerID);
    map.addLayer((--selectedLayerID), layer);
    updateLayerList();
    reloadHTMLPreviewMap();
    this.layerList.setSelectedIndex(selectedLayerID);
    this.writeGUI();
    addUndo("Move Layer Up");
}