private void getVisibleItem() {
    mFixedItem.clear();
    firstVisiblePosition = getFirstVisiblePosition();
    lastVisiblePosition = ((firstVisiblePosition) + (itemCountOnScreen)) - 1;
    for (int i = firstVisiblePosition; i <= (lastVisiblePosition); i++) {
        mFixedItem.add(mContainer.getChildAt(i));
    }
}