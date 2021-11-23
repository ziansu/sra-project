@java.lang.Override
public void onScrollStateChanged(int state, int startPosition, int endPosition, com.alibaba.android.vlayout.LayoutManagerHelper helper) {
    if ((startPosition > (getRange().getUpper())) || (endPosition < (getRange().getLower()))) {
        return ;
    }
    if (state == (android.support.v7.widget.RecyclerView.SCROLL_STATE_IDLE)) {
        checkForGaps();
    }
}