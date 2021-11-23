private void saveStudent(com.example.pustikom.adapterplay.user.Student student, int mode) {
    android.database.sqlite.SQLiteDatabase wdb = db.getWritableDatabase();
    if (mode == 0) {
        db.insert(student);
    }else {
        db.update(student);
    }
}