void newTodo(nl.mprog.glimp.gidolimperg_pset5.TodoList list, java.lang.String todo) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.TODO, todo);
    contentValues.put(DatabaseHelper.MASTER, list.getId());
    contentValues.put(DatabaseHelper.CHECKED, java.lang.Boolean.FALSE);
    database.insert(DatabaseHelper.TABLE_NAME_TODO, null, contentValues);
}