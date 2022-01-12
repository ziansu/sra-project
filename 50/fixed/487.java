public void onAddItem(android.view.View view) {
    android.widget.EditText etNewItem = findViewById(R.id.etNewItem);
    java.lang.String itemText = etNewItem.getText().toString();
    itemsAdapter.add(itemText);
    etNewItem.setText("");
}