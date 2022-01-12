@java.lang.Override
public void onResume() {
    super.onResume();
    studentList = db.fetchAllData();
    new com.example.pustikom.adapterplay.StudentActivity.DataSyncTask().execute(studentList);
}