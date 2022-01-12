@java.lang.Override
protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    final int parentLeft = 0;
    int childTop = 0;
    if (mcv.isShowWeekDayView()) {
        childTop = layout(weekDayViews, parentLeft, parentLeft, childTop);
    }
    childTop = layout(dayViews, parentLeft, parentLeft, childTop);
}