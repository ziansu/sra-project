public synchronized void select(mirur.plugins.MirurView selected) {
    if (getActiveSelected().equals(selected)) {
        return ;
    }
    lastSelectedQ.remove(selected);
    lastSelectedQ.push(selected);
    mirur.plugin.Activator.getStatistics().selected(selected);
    for (mirur.plugin.ViewSelectListener l : viewListeners) {
        notifySelectedAsync(l, selected);
    }
}