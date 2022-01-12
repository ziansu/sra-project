protected void updateIndexerCursor() {
    if (!(hasIndexer()))
        return ;
    
    android.database.Cursor cursor = getCursor();
    int column = org.fasola.fasolaminutes.IndexedCursorAdapter.getIndexColumn(cursor);
    if (column != (-1)) {
        mIndexer.setCursor(cursor, column);
    }else
        mIndexer.setCursor(null);
    
    if (cursor == null)
        mAudioColumn = -1;
    else
        mAudioColumn = cursor.getColumnIndex(CursorListFragment.AUDIO_COLUMN);
    
}