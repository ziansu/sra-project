public java.util.List<dariogonzalez.fitplaygames.classes.UserListItem> getSelectedFriends() {
    java.util.List<dariogonzalez.fitplaygames.classes.UserListItem> selectedItems = new java.util.ArrayList<>();
    for (dariogonzalez.fitplaygames.classes.UserListItem user : mFriendList) {
        if (user.getChecked()) {
            selectedItems.add(user);
        }
    }
    return selectedItems;
}