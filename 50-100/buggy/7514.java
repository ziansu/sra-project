@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent ev) {
    if (isExpanded()) {
        return false;
    }
    android.util.Log.e(com.example.tt.fragments.widget.CurveLayout.TAG, ("BottomSheet onTouchEvent: " + (currentX)));
    currentX = ev.getRawX();
    sheetDragHelper.processTouchEvent(ev);
    if ((sheetDragHelper.getCapturedView()) != null) {
        return true;
    }
    return super.onTouchEvent(ev);
}