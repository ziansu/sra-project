public void loadNextMonth() {
    if (((startDate.getTime()) >= (calendarStartDay.getTime())) && ((calendarEndDay.getTime()) > (endDate.getTime()))) {
        mCalendar.add(java.util.Calendar.MONTH, 1);
        this.setMonth(mCalendar.get(java.util.Calendar.MONTH), mCalendar.get(java.util.Calendar.YEAR));
    }
}