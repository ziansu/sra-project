private void sendCheckedFriendsToAdapter() {
    android.util.SparseBooleanArray checkeds = mRightDrawerList.getCheckedItemPositions();
    java.util.ArrayList<java.lang.Integer> curList = new java.util.ArrayList<>();
    for (int i = 0; i < (mRightDrawerList.getAdapter().getCount()); i++) {
        if (checkeds.get((i + 1))) {
            curList.add(i);
        }
    }
    friendAdapter.updateCheckedFriends(curList);
}