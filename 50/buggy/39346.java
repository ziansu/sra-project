private boolean sendSwipe(de.viktorreiser.toolbox.widget.SwipeableListItem.SwipeEvent type) {
    return mSwipeableView.onViewSwipe(this, type, mSwipeOffset, mSwipeablePosition);
}