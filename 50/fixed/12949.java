@java.lang.Override
public void onMonthChanged(int month) {
    hijriCalendar.setMonth((month + 1));
    initDays();
}