@java.lang.Override
protected java.awt.Rectangle getBoundaries(bibliothek.gui.dock.station.StationChildHandle item) {
    java.awt.Rectangle result = getBoundaries(item.getDockable().getComponent());
    java.awt.Rectangle title = null;
    if ((item.getTitle()) != null) {
        title = getBoundaries(item.getTitle().getComponent());
        if (result == null) {
            result = title;
        }else {
            result = result.union(title);
        }
    }
    return result;
}