public void OnAddItem(android.view.View v) {
    android.widget.EditText etNewItem = ((android.widget.EditText) (findViewById(R.id.etNewItem)));
    java.lang.String itemText = etNewItem.getText().toString();
    if (!(itemText.isEmpty())) {
        itemsAdapter.add(itemText);
        etNewItem.setText("");
        writeItems();
    }
}