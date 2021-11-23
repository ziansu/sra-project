@java.lang.Override
public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if (((((databaseTree.getSelectionPath()) != null) && ((databaseTree.getSelectionPath().getLastPathComponent()) instanceof com.xl.database.TableNode)) && ((dataSetList) != null)) && ((dataSetList.getSelectedValue()) instanceof com.xl.datatypes.DataSet)) {
        okButton.setEnabled(true);
    }else {
        okButton.setEnabled(false);
    }
}