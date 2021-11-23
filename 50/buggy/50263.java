public void addButtonPressed() {
    android.content.Intent addIntent = new android.content.Intent(this, com.example.sung.timetracker.EditListActivity.class);
    listDatas = adapter.getListItems();
    addIntent.putExtra("LIST_DATA_TO_EDIT", listDatas);
    startActivityForResult(addIntent, com.example.sung.timetracker.ListActivity.REQ_ADD);
}