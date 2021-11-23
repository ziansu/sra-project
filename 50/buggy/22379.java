private void SetupList2(java.util.Date date) {
    android.database.Cursor cursor = doableItemValueTableAdapter.getItems(date);
    adapter.changeCursor(cursor);
}