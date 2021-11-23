private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    mdHotels = ((javax.swing.table.DefaultTableModel) (jTableHotels.getModel()));
    if ((jTableHotels.getSelectedRowCount()) == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "please select the Hotel to delete");
        return ;
    }
    java.lang.String HotelName;
    int TempSelectRow = jTableHotels.getSelectedRow();
    HotelName = mdHotels.getValueAt(TempSelectRow, 0).toString();
    deleteHotel(HotelName);
    mdHotels.removeRow(jTableHotels.getSelectedRow());
    mdHotels = null;
}