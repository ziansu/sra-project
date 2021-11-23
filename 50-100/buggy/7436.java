private com.alamkanak.weekview.WeekViewEvent getEvent(long start, long end, java.lang.String title) {
    java.util.Calendar startTime = java.util.Calendar.getInstance();
    java.util.Calendar endTime = java.util.Calendar.getInstance();
    startTime.setTimeInMillis(start);
    endTime.setTimeInMillis(end);
    com.alamkanak.weekview.WeekViewEvent event = new com.alamkanak.weekview.WeekViewEvent(1, getEventTitle(startTime, title), startTime, endTime);
    event.setColor(getResources().getColor(R.color.primary));
    mWeekView.notifyDatasetChanged();
    return event;
}