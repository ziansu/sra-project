@java.lang.Override
public void onUpdateScrollBarBounds(android.graphics.Rect barBounds) {
    xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider boundsProvider = new xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider(0, barBounds.height());
    mIndicatorOffset = barBounds.top;
    mScreenPositionCalculator = new xyz.danoz.recyclerviewfastscroller.calculation.position.VerticalScreenPositionCalculator(boundsProvider);
}