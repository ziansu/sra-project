@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((tempDragView) == null) {
        org.unimelb.itime.vendor.dayview.DayInnerBodyEventLayout container = ((org.unimelb.itime.vendor.dayview.DayInnerBodyEventLayout) (v));
        tempDragView = createTimeSlotView(null);
        tempDragView.setY(nowTapY);
        container.addView(tempDragView);
        tempDragView.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                tempDragView.performLongClick();
            }
        }, 100);
    }
    return true;
}