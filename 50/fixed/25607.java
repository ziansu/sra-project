@java.lang.Override
public org.gwtopenmaps.openlayers.client.control.Control createDrawTool(org.gwtopenmaps.openlayers.client.layer.Layer layer) {
    return mapControlFactory.createEditingControl(ModifyFeature.RESHAPE, layer);
}