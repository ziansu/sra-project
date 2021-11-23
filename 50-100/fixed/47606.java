private void updateIndexerCursor() {
    if (!(hasIndexer()))
        return ;
    
    android.database.Cursor cursor = getCursor();
    int column = org.fasola.fasolaminutes.IndexedCursorAdapter.getIndexColumn(cursor);
    if (column != (-1)) {
        mIndexer.setCursor(cursor, column);
    }else
        mIndexer.setCursor(null);
    
}