public void setMinDate(com.fourmob.datetimepicker.date.SimpleMonthAdapter.CalendarDay minDate) {
    if ((mDayPickerView) != null) {
        mDayPickerView.setMinDate(minDate);
    }else {
        this.minDate = minDate;
    }
}