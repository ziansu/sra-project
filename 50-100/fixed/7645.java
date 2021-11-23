private void hidePickersIfNeeded() {
    if (calendarMode.equals(AbstractDateWidget.CalendarMode.MONTH_YEAR)) {
        dayPicker.setVisibility(View.GONE);
        dayPicker.setValue(1);
    }else
        if (calendarMode.equals(AbstractDateWidget.CalendarMode.YEAR)) {
            dayPicker.setVisibility(View.GONE);
            monthPicker.setVisibility(View.GONE);
            dayPicker.setValue(1);
            yearPicker.setValue(1);
        }
    
}