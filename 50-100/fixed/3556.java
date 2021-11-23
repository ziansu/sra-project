private void resetCell() {
    if ((downPosition) != (android.widget.ListView.INVALID_POSITION)) {
        if ((swipeCurrentAction) == (SwipeListView.SWIPE_ACTION_CHOICE)) {
            backView.setVisibility(View.VISIBLE);
        }
        frontView.setClickable(opened.get(downPosition));
        frontView.setLongClickable(false);
        frontView = null;
        backView = null;
        downPosition = android.widget.ListView.INVALID_POSITION;
    }
}