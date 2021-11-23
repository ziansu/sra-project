public void disableMenubar() {
    for (java.awt.Component menuItem : menuBar.getComponents()) {
        if (menuItem.isEnabled()) {
            menuItem.setEnabled(false);
            disabledMenus.add(((javax.swing.JMenuItem) (menuItem)));
        }
    }
}