@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapter, android.view.View item, int pos, long id) {
    us.conqr.simpletodo.ToDoItem toDoItem = items.get(pos);
    databaseHelper.DeleteItem(toDoItem);
    items.remove(pos);
    itemsAdapter.notifyDataSetChanged();
    return true;
}