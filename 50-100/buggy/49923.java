private boolean isEventsCollide(com.alamkanak.weekview.WeekViewEvent event1, com.alamkanak.weekview.WeekViewEvent event2) {
    long start1 = event1.getStartTime().getTimeInMillis();
    long end1 = event1.getEndTime().getTimeInMillis();
    long start2 = event2.getStartTime().getTimeInMillis();
    long end2 = event2.getEndTime().getTimeInMillis();
    return ((start1 > start2) && (start1 < end2)) || ((end1 > start2) && (end1 < end2));
}