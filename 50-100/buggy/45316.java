void addTask(android.view.View v) {
    android.widget.EditText textbox = ((android.widget.EditText) (findViewById(R.id.taskName)));
    com.example.ysingh9481.taskmanager.var text = textbox.getText().toString();
    items.add(text.getText().toString());
    myAdapter.notifyDataSetChanged();
    text.setText("");
}