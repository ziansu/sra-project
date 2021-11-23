private void SetupList2(java.util.Date date) {
    cursor = doableItemValueTableAdapter.getItems(date);
    adapter.changeCursor(cursor);
}