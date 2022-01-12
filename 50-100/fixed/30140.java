public void onDayClick(com.fourmob.datetimepicker.date.SimpleMonthView simpleMonthView, com.fourmob.datetimepicker.date.SimpleMonthAdapter.CalendarDay calendarDay) {
    if (calendarDay != null) {
        if ((((this.mMinDate) == null) || (calendarDay.isAfter(this.mMinDate))) || (calendarDay.equals(this.mMinDate))) {
            onDayTapped(calendarDay);
        }else {
            android.util.Log.i(com.fourmob.datetimepicker.date.SimpleMonthAdapter.TAG, "ignoring push since day is after mindate or mindate is not set");
        }
    }
}