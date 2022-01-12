protected void updateVisibility() {
    bibliothek.gui.dock.station.StationChildHandle fullscreenHandle = fullScreenDockable;
    if (fullscreenHandle == null) {
        for (bibliothek.gui.dock.station.StationChildHandle handle : dockables) {
            handle.getDisplayer().getComponent().setVisible(true);
        }
    }else {
        for (bibliothek.gui.dock.station.StationChildHandle handle : dockables) {
            handle.getDisplayer().getComponent().setVisible((handle == fullscreenHandle));
        }
    }
}