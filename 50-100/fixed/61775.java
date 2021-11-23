public void setToday() {
    calendarView.goToday();
    mDate.setYear(((calendarView.getYear()) - 1900));
    mDate.setMonth(calendarView.getMonth());
    mDate.setDate(calendarView.mToday.getDayOfMonth());
    tv_month.setText(android.text.format.DateUtils.getMonthString(calendarView.getMonth(), DateUtils.LENGTH_LONG));
}