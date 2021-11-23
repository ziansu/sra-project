@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    removeItemFromDatabase(items.get(position));
    items.remove(position);
    itemsAdapter.notifyDataSetChanged();
    return true;
}