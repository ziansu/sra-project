private void getVisibleItem() {
    mFixedItem.clear();
    int firstVisiblePosition = getFirstVisiblePosition();
    int lastVisiblePosition = firstVisiblePosition + (itemCountOnScreen);
    for (int i = firstVisiblePosition; i <= lastVisiblePosition; i++) {
        mFixedItem.add(mContainer.getChildAt(i));
    }
}