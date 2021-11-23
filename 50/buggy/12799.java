public void invalidateSelection() {
    calendarDateManager.clearCalendarData();
    new android.os.Handler().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            notifyDataSetChanged();
        }
    });
}