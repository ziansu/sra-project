@java.lang.Override
public void queryChanged(gov.ornl.eden.DataModel dataModel) {
    gov.ornl.eden.DataTableModel.log.debug("queryChanged called");
    fireTableDataChanged();
}