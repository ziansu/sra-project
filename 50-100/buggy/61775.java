public void setToday() {
    calendarView.goToday();
    mDate.setYear(calendarView.getYear());
    mDate.setMonth(((calendarView.getMonth()) - 1900));
    mDate.setDate(calendarView.mToday.getDayOfMonth());
    tv_month.setText(android.text.format.DateUtils.getMonthString(calendarView.getMonth(), DateUtils.LENGTH_LONG));
}