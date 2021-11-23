void addTask(android.view.View v) {
    android.widget.EditText textbox = ((android.widget.EditText) (findViewById(R.id.taskName)));
    java.lang.String text = textbox.getText().toString();
    if (text != "") {
        items.add(text);
        myAdapter.notifyDataSetChanged();
        textbox.setText("");
    }else {
    }
}