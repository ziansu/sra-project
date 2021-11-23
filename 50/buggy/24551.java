@java.lang.Override
public void onPageSelected(int position) {
    if (isAutoScroll()) {
        removeCallbacks(scrollAction);
        postDelayed(scrollAction, intervalTime);
    }
}