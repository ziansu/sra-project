@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    items.remove(position);
    itemsAdapter.notifyDataSetChanged();
    removeItemFromDatabase(position);
    return true;
}