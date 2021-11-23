protected void filterChanged() {
    java.lang.System.out.println(("filterChanged " + (filterListeners.size())));
    for (crazypants.enderio.conduit.gui.FilterChangeListener list : filterListeners) {
        list.onFilterChanged();
    }
}