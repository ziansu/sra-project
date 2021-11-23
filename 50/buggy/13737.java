public void replaceItemWithKey(com.firebasechatdemo.ui.model.UserListModel listModel) {
    int itemPositionWithKey = getItemPositionWithKey(listModel.userID);
    if (itemPositionWithKey != (-1)) {
        setItem(itemPositionWithKey, listModel);
    }
}