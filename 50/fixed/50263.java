public void addButtonPressed() {
    android.content.Intent addIntent = new android.content.Intent(this, com.example.sung.timetracker.EditListActivity.class);
    startActivityForResult(addIntent, com.example.sung.timetracker.ListActivity.REQ_ADD);
}