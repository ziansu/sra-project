@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mCalendarAdapter.notifyDataSetChanged();
        }
    });
    if ((calendarListener) != null) {
        calendarListener.onCalendarScroll(calendarView, dx, dy);
    }
}