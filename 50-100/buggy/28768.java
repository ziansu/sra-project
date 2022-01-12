@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent lse) {
    int modelRow = ((dlgTable.getSelectedRow()) == (-1)) ? -1 : dlgTable.convertRowIndexToModel(dlgTable.getSelectedRow());
    if (modelRow > (-1)) {
        btnEdit.setEnabled(true);
        btnResetPW.setEnabled(true);
    }else {
        btnEdit.setEnabled(false);
        btnResetPW.setEnabled(false);
    }
}