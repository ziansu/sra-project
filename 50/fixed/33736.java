@java.lang.Override
public void onSelectDate(java.util.Date date, android.view.View view) {
    if ((calendarListener) != null) {
        calendarListener.onSelectDate(date);
    }else {
        setSelectedDate(date);
    }
}