@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    com.github.mikephil.charting.listener.OnChartGestureListener l = mChart.getOnChartGestureListener();
    if (l != null) {
        l.onChartSingleTapped(e);
    }
    performHighlight(e);
    return super.onSingleTapUp(e);
}