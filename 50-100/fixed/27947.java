public boolean onOptionsItemSelected(android.view.MenuItem item) {
    com.example.pustikom.adapterplay.user.StudentList students;
    switch (item.getItemId()) {
        case R.id.createDummyItem :
            students = populateStudentDummies();
            new com.example.pustikom.adapterplay.StudentActivity.DataSyncTask().execute(students);
            return true;
        case R.id.clearListItem :
            db.truncate();
            new com.example.pustikom.adapterplay.StudentActivity.DataSyncTask().execute(new com.example.pustikom.adapterplay.user.StudentList());
            return true;
    }
    return super.onOptionsItemSelected(item);
}