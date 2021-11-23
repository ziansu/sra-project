public void filterComplete() {
    if (!(isFiltered)) {
        mDisplayingItemTableList = new java.util.ArrayList<>();
        for (com.demo.kuanyi.todolist.model.ListItemTable itemTable : mAllListItemTableList) {
            if (itemTable.isComplete()) {
                mDisplayingItemTableList.add(itemTable);
            }
        }
    }else {
        mDisplayingItemTableList = new java.util.ArrayList<>();
        mDisplayingItemTableList.addAll(mAllListItemTableList);
    }
    isFiltered = !(isFiltered);
    notifyDataSetChanged();
}