@java.lang.Override
public void onScroll(float v) {
    pager.requestDisallowInterceptTouchEvent(true);
    cardIssueAdapter.setFirstCardState(v);
    android.util.Log.d("Scroll", java.lang.Float.toString(v));
}