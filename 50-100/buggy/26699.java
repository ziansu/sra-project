private void closeCurrentColumn() {
    if ((currentTable) != null) {
        if ((((currentTable.currentColumn) != null) && (!(currentTable.currentColumn.name.equals("")))) && ((currentTable.currentColumn.type) != (com.binarskugga.data.SQLTypes.NO_TYPE)))
            currentTable.columns.add(currentTable.currentColumn);
        
    }
}