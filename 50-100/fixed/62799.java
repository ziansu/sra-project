public void commitButtonPressed(android.view.View v) {
    java.util.ArrayList<java.lang.Integer> selectedIds = new java.util.ArrayList<>();
    for (cwa115.trongame.Lists.FriendListItem item : friendListItems) {
        if (item.isSelected())
            selectedIds.add(((int) (item.getPlayer().getId())));
        
    }
    commit(selectedIds);
}