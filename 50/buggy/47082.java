public void setRemovable(int itemLongClicked) {
    T item = mItems.get(itemLongClicked);
    boolean isRemovable = !(item.getCanRemove());
    item.setCanRemove(isRemovable);
    todo.javier.mera.todolist.adapters.RecyclerAdapter.notifyItemChanged(itemLongClicked);
}