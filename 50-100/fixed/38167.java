private void activate(de.neemann.digital.gui.components.Wire wire, de.neemann.digital.gui.components.Vector pos) {
    super.activate();
    this.wire = wire;
    this.pos = de.neemann.digital.gui.components.CircuitComponent.raster(pos);
    deleteAction.setActive(true);
    removeHighLighted();
    hasChanged();
}