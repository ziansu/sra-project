public java.util.List<dariogonzalez.fitplaygames.classes.UserListItem> getSelectedFriends() {
    java.util.List<dariogonzalez.fitplaygames.classes.UserListItem> selectedItems = new java.util.ArrayList<>();
    for (int i = 0; i < (mFriendList.size()); i++) {
        dariogonzalez.fitplaygames.classes.UserListItem user = adapter.getItem(i);
        if (user.getChecked()) {
            selectedItems.add(user);
        }
    }
    return selectedItems;
}