private void setScheduleDates() {
    java.util.HashMap<java.util.Date, android.graphics.drawable.Drawable> map = new java.util.HashMap<>();
    for (java.util.Date date : mScheduledDate) {
        android.util.Log.e(yhh.bj4.trainer.calendar.CalendarFragment.TAG, ("setScheduleDates: " + date));
        map.put(date, getScheduleDateDrawable());
    }
    mCaldroidFragment.setBackgroundDrawableForDates(map);
    mCaldroidFragment.refreshView();
}