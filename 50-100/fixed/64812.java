private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    subSetup();
    disableItems();
    popupMenu.add(openTileItem);
    popupMenu.addSeparator();
    popupMenu.add(gridTileItem);
    popupMenu.addSeparator();
    popupMenu.add(closeTileItem);
}