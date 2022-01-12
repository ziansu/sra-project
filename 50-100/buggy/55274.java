@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent i = new android.content.Intent(this, com.example.desy.todoapp.EditToDo.class);
    pos = position;
    i.putExtra("itemList", items.get(position));
    items.remove(pos);
    startActivityForResult(i, REQUEST_CODE);
    startActivity(i);
}