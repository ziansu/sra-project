@java.lang.Override
public void onClick(android.view.View v) {
    ((android.support.v7.widget.LinearLayoutManager) (rv.getLayoutManager())).scrollToPositionWithOffset(1, headerHeight);
    resetScroll(false);
}