public void showDate(int year, int month) {
    if ((mAdapter) != null) {
        mAdapter.setDate(year, month);
        initDateText();
        if ((onCalendarChangeListener) != null)
            onCalendarChangeListener.onMonthChanged(year, (month + 1));
        
    }
}