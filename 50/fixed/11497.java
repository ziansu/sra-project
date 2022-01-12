private void popupSetup() {
    popupMenu = new javax.swing.JPopupMenu();
    subSetup();
    disableItems();
    popupMenu.add(renameItem);
    popupMenu.addSeparator();
    popupMenu.add(shiftItem);
}