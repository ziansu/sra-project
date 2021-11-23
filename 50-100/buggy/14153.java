@java.lang.Override
public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent arg0) {
    int index = table.getSelectionIndex();
    java.lang.String selectedTable = wizardImport.getData().getJdbcTables().get(index);
    wizardImport.getData().setSelectedJdbcTable(selectedTable);
    readColumns();
    readPreview();
    setPageComplete(true);
}