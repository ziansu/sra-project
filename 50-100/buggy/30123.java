@java.lang.Override
public void onItemDropped(int newPosition) {
    T item = getItem(newPosition);
    item.setMoving(false);
    todo.javier.mera.todolist.adapters.RecyclerAdapter.notifyItemChanged(newPosition);
    java.util.Map<java.lang.String, java.lang.Integer> items = new java.util.LinkedHashMap<>();
    for (int position = 0; position < (mItems.size()); position++) {
        items.put(mItems.get(position).getId(), position);
    }
    mFragment.onItemsUpdate(items);
}