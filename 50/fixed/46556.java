public void actionPerformed(java.awt.event.ActionEvent e) {
    tbModel.setRowCount(((numItems) + 1));
    tbModel.setValueAt(defaultVal, numItems, 4);
    (numItems)++;
}