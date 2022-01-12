private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    disableItems();
    subSetup();
    popupMenu.add(openTileItem);
    popupMenu.addSeparator();
    popupMenu.add(gridTileItem);
    popupMenu.addSeparator();
    popupMenu.add(closeTileItem);
}