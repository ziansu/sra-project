@java.lang.Override
public void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
    D(((((("target: " + (target.toString())) + ", dyConsumed = ") + dyConsumed) + ", dyUnconsumed = ") + dyUnconsumed));
    if ((dyUnconsumed < 0) && (canScrollUp())) {
        offsetContent((-dyUnconsumed));
    }
}