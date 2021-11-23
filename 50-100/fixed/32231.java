public void onAddItem(android.view.View view) {
    android.widget.EditText etNewItem = ((android.widget.EditText) (findViewById(R.id.etNewItem)));
    java.lang.String item = etNewItem.getText().toString();
    if ((item.length()) < 1) {
        return ;
    }
    com.narasimman.android.todo.Task task = new com.narasimman.android.todo.Task(item);
    etNewItem.setText("");
    long id = saveToDB(task);
    task.setId(id);
    items.add(task);
    itemsAdaptor.notifyDataSetChanged();
}