public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.deleteStudentItem :
            int id = student.getId();
            android.database.sqlite.SQLiteDatabase wdb = db.getWritableDatabase();
            db.delete(id);
            finish();
            return true;
    }
    return super.onOptionsItemSelected(item);
}