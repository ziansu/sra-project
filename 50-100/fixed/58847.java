public void setUploaded(int id) {
    int rows_affected = 0;
    this.table = "Files";
    this.values = new android.content.ContentValues();
    this.values.put("uploaded", "1");
    this.whereClause = "id = " + id;
    this.whereArgs = null;
    rows_affected = this.my_update(this.table, this.values, this.whereClause, this.whereArgs);
}