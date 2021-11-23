@java.lang.Override
public void widgetDisposed(final org.eclipse.swt.events.DisposeEvent event) {
    final org.jowidgets.common.model.ITableDataModelObservable dataModelObservable = dataModel.getTableDataModelObservable();
    if (dataModelObservable != null) {
        dataModelObservable.removeDataModelListener(tableModelListener);
    }
    final org.jowidgets.common.model.ITableColumnModelObservable columnModelObservable = columnModel.getTableColumnModelObservable();
    if (columnModelObservable != null) {
        columnModelObservable.removeColumnModelListener(tableColumnModelListener);
    }
}