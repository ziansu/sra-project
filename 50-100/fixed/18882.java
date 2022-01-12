private void updateItemState(android.view.MotionEvent ev) {
    int touchPointX = ((int) (ev.getX()));
    getVisibleItem();
    itemId = (touchPointX + 1) / (mItemWidth);
    if ((itemId) < 0) {
        itemId = 0;
    }else
        if ((itemId) > ((mFixedItem.size()) - 1)) {
            itemId = (mFixedItem.size()) - 1;
        }
    
    showItemAnimation();
}