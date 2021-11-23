@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    xyz.danoz.recyclerviewfastscroller.calculation.progress.TouchableScrollProgressCalculator scrollProgressCalculator = getScrollProgressCalculator();
    if (scrollProgressCalculator != null) {
        float scrollProgress = getScrollProgressCalculator().calculateScrollProgress(recyclerView);
        moveHandleToPosition(scrollProgress);
    }
}