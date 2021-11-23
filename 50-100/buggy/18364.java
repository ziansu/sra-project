public android.content.ContentValues getContentValues() {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("title", this.getTitle());
    values.put("taskText", this.getText());
    values.put("done", this.isDoneInt());
    values.put("due", ((this.getDue()) == null ? this.getDue().toString() : "1970-01-01"));
    return values;
}