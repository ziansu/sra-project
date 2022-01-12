@java.lang.Override
public java.util.List<com.alamkanak.weekview.WeekViewEvent> onMonthChange(int newYear, int newMonth) {
    java.util.List<com.alamkanak.weekview.WeekViewEvent> events = generateEventsFromJson(newYear, newMonth);
    return events;
}