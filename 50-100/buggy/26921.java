public void onDayClick(java.util.Calendar daySelectedCalendar) {
    year = daySelectedCalendar.get(java.util.Calendar.YEAR);
    month = (daySelectedCalendar.get(java.util.Calendar.MONTH)) + 1;
    date = daySelectedCalendar.get(java.util.Calendar.DAY_OF_MONTH);
    robotoCalendarView.markCircleImage1(daySelectedCalendar);
    list_update();
    android.widget.Toast.makeText(getActivity(), ("onDayClick: " + (daySelectedCalendar.getTime())), Toast.LENGTH_SHORT).show();
}