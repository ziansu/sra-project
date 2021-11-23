@java.lang.Override
protected void onStart() {
    super.onStart();
    populateArrayItems(itemDb.getAllData());
}