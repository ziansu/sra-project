public void removeItem(com.demo.kuanyi.todolist.model.ListItemTable itemTable) {
    int position = mListItemTableList.indexOf(itemTable);
    notifyAdapterSizeChange();
    notifyItemRemoved(position);
    mListItemTableList.remove(position);
}