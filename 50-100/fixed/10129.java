private android.widget.SimpleCursorAdapter getThemedAdapter(android.database.Cursor cursor) {
    java.lang.String[] dataColumns = new java.lang.String[]{ NotePad.Notes.COLUMN_NAME_TITLE , NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE };
    int[] viewIDs = new int[]{ R.id.itemTitle , R.id.itemDate };
    int themed_item;
    if (FragmentLayout.lightTheme)
        themed_item = R.layout.noteslist_item_light;
    else
        themed_item = R.layout.noteslist_item_dark;
    
    android.widget.SimpleCursorAdapter adapter = new android.widget.SimpleCursorAdapter(activity, themed_item, cursor, dataColumns, viewIDs);
    return adapter;
}