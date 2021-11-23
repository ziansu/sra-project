private void createList() {
    example.kissanproject.ui.TabFragments.Fragment2.smsRecords = dbHelper.getAllToDos();
    dbHelper.closeDB();
}