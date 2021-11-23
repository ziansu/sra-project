@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    final int index = table.getSelectedRow();
    final io.github.davidg95.JTill.jtillserver.Product p = currentTableContents.get(index);
    if (index == (-1)) {
        return ;
    }
    if ((javax.swing.JOptionPane.showInternalConfirmDialog(this, ("Are you sure you want to remove this item?\n" + p), "Stock Item", javax.swing.JOptionPane.YES_NO_OPTION)) == (javax.swing.JOptionPane.YES_OPTION)) {
        currentTableContents.remove(index);
        updateTable();
    }
}