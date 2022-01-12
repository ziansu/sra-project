private void subSetup() {
    renameItem = new javax.swing.JMenuItem("Rename...");
    shiftItem = new javax.swing.JMenuItem("Shift...");
    editSetup();
    renameItem.addActionListener(fruitListener);
    shiftItem.addActionListener(fruitListener);
    renameItem.setName("rename");
    shiftItem.setName("shift");
    fruitEditor.putComponent(renameItem.getName(), renameItem);
    fruitEditor.putComponent(shiftItem.getName(), shiftItem);
}