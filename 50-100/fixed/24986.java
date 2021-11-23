private void jButtonDeleteAttractionActionPerformed(java.awt.event.ActionEvent evt) {
    mdAttraction = ((javax.swing.table.DefaultTableModel) (jTableAttractions.getModel()));
    if ((jTableAttractions.getSelectedRowCount()) == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "please select the Attraction to delete");
        return ;
    }
    java.lang.String AttractionName;
    int TempSelectRow = jTableAttractions.getSelectedRow();
    AttractionName = mdAttraction.getValueAt(TempSelectRow, 1).toString();
    deleteAttraction(AttractionName);
    mdAttraction.removeRow(jTableAttractions.getSelectedRow());
}