public void actionPerformed(java.awt.event.ActionEvent e) {
    boolean value = ((javax.swing.JCheckBox) (e.getSource())).isSelected();
    TaskTreeTableCellRenderer.viewAll = value;
    net.sf.memoranda.util.FileStorage.setViewAll(value);
    taskTable.updateUI();
}