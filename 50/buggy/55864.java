public void onDateRangeSelectionEnded(com.appeaser.sublimepickerlibrary.datepicker.SelectedDate selectedDate) {
    if ((mDaySelectionEventListener) != null) {
        mDaySelectionEventListener.onDateRangeSelectionEnded(selectedDate);
    }
}