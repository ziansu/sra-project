public void onAddItem(android.view.View view) {
    etNewItem = ((android.widget.EditText) (findViewById(R.id.etNewItem)));
    java.lang.String itemText = etNewItem.getText().toString();
    com.getlosthere.completeme.Item newItem = new com.getlosthere.completeme.Item(itemText);
    newItem.save();
    itemsAdapter.add(newItem);
    etNewItem.setText("");
    sortItems();
}