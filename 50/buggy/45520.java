public void addLayer(final com.thommil.libgdx.runtime.layer.Layer layer) {
    if (!(paused))
        throw new com.thommil.libgdx.runtime.GameRuntimeException("Layers can only be added/removed in paused state");
    
    this.layers.add(layer);
    layer.bind(this);
}