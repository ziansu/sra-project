protected void doResumeUpdates() {
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.Locale.getDefault());
    mFirstDayOfWeek = (cal.getFirstDayOfWeek()) - 1;
    mShowWeekNumber = false;
    updateHeader();
    goTo(mSelectedDay.toMillis(true), false, true, false);
    mAdapter.setSelectedDay(mSelectedDay);
    mTodayUpdater.run();
}