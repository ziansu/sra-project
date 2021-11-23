private void createList() {
    example.kissanproject.ui.TabFragments.Fragment2.smsRecords = dbHelper.getAllToDos();
    dbHelper.closeDB();
    android.util.Log.e("error_dbinflate", java.lang.String.valueOf(example.kissanproject.ui.TabFragments.Fragment2.smsRecords.get(0).getmNumber()));
}