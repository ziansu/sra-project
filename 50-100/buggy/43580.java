@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<org.geowe.client.local.main.VectorLayerInfo> event) {
    org.geowe.client.local.model.vector.VectorLayer layer = ((org.geowe.client.local.model.vector.VectorLayer) (layerManagerWidget.getSelectedLayer(LayerManagerWidget.VECTOR_TAB)));
    new org.gwtopenmaps.openlayers.client.control.SelectFeature(layer).unselectAll(null);
    layerManagerWidget.setSelectedLayer(LayerManagerWidget.VECTOR_TAB, layerCombo.getValue().getLayer());
}