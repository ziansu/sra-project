@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int pos, long id) {
    android.content.Intent intent = new android.content.Intent(this, com.example.munix.todos.TodoActivity.class);
    java.lang.String content = ((java.lang.String) (lv.getItemAtPosition(pos)));
    intent.putExtra("Content", content);
    startActivity(intent);
}