@java.lang.Override
public void onClick(android.view.View v) {
    boolean deleted = data.remove(todos.get(position));
    if (deleted) {
        clear();
        (time)--;
        todos = data.getData();
        addAll(todos);
        toDoArrayAdapter.notifyDataSetChanged();
        android.widget.Toast.makeText(this, "Deleted!", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show();
    }
}