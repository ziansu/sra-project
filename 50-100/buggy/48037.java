public void addLayer(final int index, final com.thommil.libgdx.runtime.layer.Layer layer) {
    if (!(paused))
        throw new com.thommil.libgdx.runtime.GameRuntimeException("Layers can only be added/removed in paused state");
    
    while (index > ((this.layers.size) - 1)) {
        this.layers.add(null);
    } 
    this.layers.set(index, layer);
    layer.bind(this);
}