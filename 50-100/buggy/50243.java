public void addToolTestDataInputFile() {
    listStore.commitChanges();
    java.lang.String inputFile = "";
    editing.cancelEditing();
    listStore.add(0, inputFile);
    int row = listStore.indexOf(inputFile);
    editing.startEditing(new com.sencha.gxt.widget.core.client.grid.Grid.GridCell(row, 0));
}