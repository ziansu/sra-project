public void actionPerformed(java.awt.event.ActionEvent arg0) {
    filterHeader = new net.coderazzi.filters.gui.TableFilterHeader(null, net.coderazzi.filters.gui.AutoChoices.ENABLED);
    filterHeader.setSelectionBackground(java.awt.Color.LIGHT_GRAY);
    if (panelFilters.isVisible()) {
        panelFilters.setVisible(false);
        filterHeader.setTable(null);
    }else {
        panelFilters.setVisible(true);
        filterHeader.setTable(tableCards);
    }
}