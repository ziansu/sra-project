public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (panelFilters.isVisible()) {
        panelFilters.setVisible(false);
        filterHeader.setVisible(false);
    }else {
        panelFilters.setVisible(true);
        filterHeader.setVisible(true);
    }
}