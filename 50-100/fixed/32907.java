public void onAddItem(android.view.View v) {
    android.widget.EditText etNewItem = ((android.widget.EditText) (findViewById(R.id.etNewItem)));
    java.lang.String itemText = etNewItem.getText().toString();
    itemsAdapter.add(itemText);
    etNewItem.setText("");
    if ((userid) != null) {
        fooItem.put("userId", userid);
    }
    if (itemText != null) {
        fooItem.put("value", itemText);
    }
    fooItem.saveInBackground();
}