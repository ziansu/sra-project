public void onClick2(android.view.View view) {
    if ((mScrollingCalendarDialog) == null) {
        mScrollingCalendarDialog = new com.jastzeonic.calendar.ScrollingCalendarDialog(this);
    }
    mScrollingCalendarDialog.callCalendarView(null, ((android.widget.TextView) (view)));
}