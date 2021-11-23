public void removeItems() {
    java.util.List<T> itemsList = new java.util.LinkedList<>();
    for (int position = 0; position < (mItems.size()); position++) {
        if (getItem(position).getCanRemove()) {
            mItems.remove(position);
            todo.javier.mera.todolist.adapters.RecyclerAdapter.notifyItemRemoved(position);
            position--;
        }
    }
}