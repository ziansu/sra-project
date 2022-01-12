protected void addCursorRow(android.database.MatrixCursor cursor, jp.redmine.redmineclient.entity.IMasterRecord changes, int id, int title_id) {
    if (changes == null)
        return ;
    
    addCursorRow(cursor, changes.getName(), id, title_id);
}