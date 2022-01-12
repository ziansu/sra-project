private void hidePickersIfNeeded() {
    if (calendarMode.equals(AbstractDateWidget.CalendarMode.MONTH_YEAR)) {
        dayPicker.setVisibility(View.GONE);
        dayPicker.setValue(0);
    }else
        if (calendarMode.equals(AbstractDateWidget.CalendarMode.YEAR)) {
            dayPicker.setVisibility(View.GONE);
            monthPicker.setVisibility(View.GONE);
            dayPicker.setValue(0);
            yearPicker.setValue(0);
        }
    
}