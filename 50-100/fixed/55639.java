public void onSavedItem(android.view.View view) {
    text = etNewItem.getText().toString();
    android.content.Intent data = new android.content.Intent();
    data.putExtra("text", text);
    data.putExtra("position", position);
    setResult(com.example.jackie_zhang.todoapp.RESULT_OK, data);
    this.finish();
}