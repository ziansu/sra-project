private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    disableItems();
    subSetup();
    popupMenu.add(renameItem);
    popupMenu.addSeparator();
    popupMenu.add(shiftItem);
}