@java.lang.Override
public void onReset() {
    if ((((mHeaderView) != null) && ((mHeaderView) instanceof com.aspsine.swipetoloadlayout.SwipeTrigger)) && (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isStatusDefault(mStatus))) {
        mHeaderView.setVisibility(com.aspsine.swipetoloadlayout.GONE);
        ((com.aspsine.swipetoloadlayout.SwipeTrigger) (mHeaderView)).onReset();
    }
}