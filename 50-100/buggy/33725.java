public void addToLayer(mr.model.GameConstant.Layers layer, java.util.Collection<mr.view.RenderingImage> images) {
    if ((layers) == null) {
        layers = new java.util.ArrayList<java.util.List<mr.view.RenderingImage>>(layer.ordinal());
    }
    while ((layers.size()) < (layer.ordinal())) {
        layers.add(new java.util.ArrayList<mr.view.RenderingImage>());
    } 
    layers.get(layer.ordinal()).addAll(images);
}