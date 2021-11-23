public void addPhoto(int path, java.lang.String emotion, java.lang.String fileName) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("path", path);
    values.put("emotion", emotion);
    values.put("name", fileName);
    db.insertOrThrow("photos", null, values);
}