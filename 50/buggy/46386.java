@java.lang.Override
public void run() {
    instancesModel.update();
    if ((instancesTable.getRowCount()) > 0) {
        instancesTable.setRowSelectionInterval(0, 0);
    }
    requestFocus();
}