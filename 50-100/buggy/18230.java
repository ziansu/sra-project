@java.lang.Override
public synchronized void actionPerformed(java.awt.event.ActionEvent e) {
    org.openstreetmap.josm.gui.autofilter.AutoFilterManager afm = org.openstreetmap.josm.gui.autofilter.AutoFilterManager.getInstance();
    if ((afm.getCurrentAutoFilter()) == filter) {
        afm.setCurrentAutoFilter(null);
        Main.map.filterDialog.getFilterModel().executeFilters();
    }else {
        afm.setCurrentAutoFilter(filter);
    }
}