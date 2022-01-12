@java.lang.Override
public void onClick(android.view.View v) {
    boolean deleted = this.deleteFile(((tv.getText().toString()) + ".todo"));
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