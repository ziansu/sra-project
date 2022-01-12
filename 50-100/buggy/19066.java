@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent editIntent = new android.content.Intent(this, com.codepath.simpletodo.EditActivity.class);
    editIntent.putExtra("text", todoItems.get(position));
    editIntent.putExtra("position", position);
    startActivityForResult(editIntent, com.codepath.simpletodo.RESULT_OK);
}