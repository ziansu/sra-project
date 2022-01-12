public void disableMenubar() {
    this.disabledMenus = new java.util.HashSet<javax.swing.JMenuItem>();
    for (java.awt.Component menuItem : menuBar.getComponents()) {
        if (menuItem.isEnabled()) {
            menuItem.setEnabled(false);
            disabledMenus.add(((javax.swing.JMenuItem) (menuItem)));
        }
    }
}