public org.gwtopenmaps.openlayers.client.control.ModifyFeature createEditingControl(int mode, org.gwtopenmaps.openlayers.client.layer.Layer layer) {
    org.gwtopenmaps.openlayers.client.control.ModifyFeatureOptions modifyFeatureOptions = new org.gwtopenmaps.openlayers.client.control.ModifyFeatureOptions();
    org.gwtopenmaps.openlayers.client.control.ModifyFeature modifyFeature = new org.gwtopenmaps.openlayers.client.control.ModifyFeature(((org.gwtopenmaps.openlayers.client.layer.Vector) (layer)), modifyFeatureOptions);
    modifyFeature.setVirtualStyle(org.geowe.client.local.main.map.MapControlFactory.getEditionStyle());
    modifyFeature.setMode(mode);
    return modifyFeature;
}