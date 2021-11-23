public void onDateRangeSelectionEnded(com.appeaser.sublimepickerlibrary.datepicker.SelectedDate selectedDate) {
    if (selectedDate != null)
        this.selectedDate = selectedDate;
    
    if ((mDaySelectionEventListener) != null) {
        mDaySelectionEventListener.onDateRangeSelectionEnded(this.selectedDate);
    }
}