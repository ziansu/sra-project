@java.lang.Override
public void recordSelected(org.entirej.framework.core.data.EJDataRecord record) {
    if ((_tableViewer) != null)
        _tableViewer.getSelectionModel().select(findTreeItem(record, _tableViewer.getRoot()));
    
}