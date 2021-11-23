@java.lang.Override
public void onRefresh() {
    if ((swipeRefresh.getScrollY()) == 0) {
        refreshActivity();
    }
}