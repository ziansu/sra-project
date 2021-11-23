private final void dockImpl(org.dockfx.DockPane newDockPane) {
    if (dockPane.isFloating()) {
        setFloating(false);
    }
    this.dockPane = newDockPane;
    this.closedProperty.set(false);
}