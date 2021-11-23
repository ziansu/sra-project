@java.lang.Override
public java.util.List<? extends com.alamkanak.weekview.WeekViewEvent> onMonthChange(int newYear, int newMonth) {
    java.util.List<com.alamkanak.weekview.WeekViewEvent> week = retrieveData();
    return week;
}