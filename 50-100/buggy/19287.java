@bibliothek.util.Todo(compatibility = bibliothek.util.Todo.Compatibility.COMPATIBLE, priority = bibliothek.util.Todo.Priority.MAJOR, target = bibliothek.util.Todo.Version.VERSION_1_1_1, description = "Make this method not necessary")
protected void updateVisibility() {
    if (!(java.awt.EventQueue.isDispatchThread())) {
        asyncUpdateVisibility();
    }else {
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
}