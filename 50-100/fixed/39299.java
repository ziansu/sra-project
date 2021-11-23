@java.lang.Override
public void onReset() {
    if ((((mTargetView) != null) && ((mTargetView) instanceof com.aspsine.swipetoloadlayout.SwipeTrigger)) && (com.aspsine.swipetoloadlayout.SwipeToLoadLayout.STATUS.isStatusDefault(mStatus))) {
        ((com.aspsine.swipetoloadlayout.SwipeTrigger) (mTargetView)).onReset();
    }
}