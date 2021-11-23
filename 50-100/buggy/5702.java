@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapter, android.view.View item, int position, long id) {
    com.getlosthere.completeme.Item updatedItem = com.getlosthere.completeme.Item.load(com.getlosthere.completeme.Item.class, items.get(position).remoteId);
    updatedItem.completed = true;
    updatedItem.save();
    items.set(position, updatedItem);
    sortItems();
    itemsAdapter.notifyDataSetChanged();
    return true;
}