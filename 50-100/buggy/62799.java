public void commitButtonPressed(android.view.View v) {
    java.util.List<java.lang.Long> selectedIds = new java.util.ArrayList<>();
    for (cwa115.trongame.Lists.FriendListItem item : friendListItems) {
        if (item.isSelected())
            selectedIds.add(item.getPlayer().getId());
        
    }
    commit(com.google.common.primitives.Longs.toArray(selectedIds));
}