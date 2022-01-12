private void addDefaultStyleToLayer(it.geosolutions.geoserver.rest.encoder.GSLayerEncoder layerEncoder) {
    if ((defaultStyle) != null) {
        if (null == (defaultStyle.getWorkspace())) {
            layerEncoder.setDefaultStyle(defaultStyle.getName());
        }else {
            layerEncoder.setDefaultStyle(defaultStyle.getWorkspace(), defaultStyle.getName());
        }
    }
}