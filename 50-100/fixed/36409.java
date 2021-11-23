@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapter, android.view.View item, int pos, long id) {
    currentItem = itemListAdapter.getItem(pos);
    itemDataSource.openDBHandle();
    itemDataSource.deleteItem(currentItem);
    itemListAdapter.remove(currentItem);
    return true;
}