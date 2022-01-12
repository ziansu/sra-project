@java.lang.Override
public synchronized void actionPerformed(java.awt.event.ActionEvent e) {
    org.openstreetmap.josm.gui.autofilter.AutoFilterManager afm = org.openstreetmap.josm.gui.autofilter.AutoFilterManager.getInstance();
    if (filter.equals(afm.getCurrentAutoFilter())) {
        afm.setCurrentAutoFilter(null);
        Main.map.filterDialog.getFilterModel().executeFilters();
    }else {
        afm.setCurrentAutoFilter(filter);
    }
}