public void onSavedItem(android.view.View v) {
    android.content.Intent data = new android.content.Intent();
    text = etNewItem.getText().toString();
    data.putExtra("text", text);
    data.putExtra("position", position);
    setResult(com.example.jackie_zhang.todoapp.RESULT_OK, data);
    this.finish();
}