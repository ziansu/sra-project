@java.lang.Override
public java.lang.String toString() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.clear();
    calendar.set(getSelectedYear(), getSelectedMonth(), getSelectedDay(), getSelectedHour(), getSelectedMinute());
    return kankan.wheel.widget.DateTimePicker.stringDateFormatter.format(calendar.getTime());
}