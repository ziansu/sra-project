public void addTask(android.content.ContentValues data) {
    this.database.insert(DefaultValue.value.DB_table_name, null, data);
    this.notifyChange(getData().toString());
}