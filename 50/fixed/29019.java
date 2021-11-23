public void setRemovable(int position, boolean isRemovable) {
    T item = mItems.get(position);
    item.setCanRemove(isRemovable);
    todo.javier.mera.todolist.adapters.RecyclerAdapter.notifyItemChanged(position);
}