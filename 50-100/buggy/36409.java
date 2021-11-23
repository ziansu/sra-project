@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapter, android.view.View item, int pos, long id) {
    currentItem = itemListAdapter.getItem(pos);
    itemList.remove(currentItem);
    itemDataSource.openDBHandle();
    itemDataSource.deleteItem(currentItem);
    itemListAdapter.notifyDataSetChanged();
    return true;
}