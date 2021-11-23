private void updateItemState(android.view.MotionEvent ev) {
    int touchPointX = ((int) (ev.getX()));
    getVisibleItem();
    int itemId = (touchPointX + 1) / (mItemWidth);
    if (itemId < 0) {
        itemId = 0;
    }else
        if (itemId > (mFixedItem.size())) {
            itemId = mFixedItem.size();
        }
    
    showItemAnimation(itemId);
}