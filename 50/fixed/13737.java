public void replaceItemWithKey(com.firebasechatdemo.ui.model.UserListModel listModel) {
    int itemPositionWithKey = getItemPositionWithKey(listModel.id);
    if (itemPositionWithKey != (-1)) {
        setItem(itemPositionWithKey, listModel);
    }
}