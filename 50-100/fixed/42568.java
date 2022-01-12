private void moveDownLayerButtonActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedLayerID = layerList.getSelectedIndex();
    if ((selectedLayerID < 0) || (selectedLayerID >= ((map.getLayerCount()) - 1))) {
        return ;
    }
    edu.oregonstate.carto.mapcomposer.Layer layer = map.removeLayer(selectedLayerID);
    map.addLayer((++selectedLayerID), layer);
    updateLayerList();
    layerList.setSelectedIndex(selectedLayerID);
    writeGUI(true);
    addUndo("Move Layer Down");
}