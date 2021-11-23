@java.lang.Override
public void onScroll(float v) {
    pager.requestDisallowInterceptTouchEvent(true);
    cardIssueAdapter.setFirstCardState(v);
}