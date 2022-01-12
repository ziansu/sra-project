private void selectDayAt(float x, float y) {
    com.phlox.datepick.CalendarNumbersView.CalendarDayCellCoord cellCoords = getCellForCoords(x, y);
    setCalendarToFirstVisibleDay(_calendar);
    _calendar.add(java.util.Calendar.DAY_OF_YEAR, cellCoords.col);
    _calendar.add(java.util.Calendar.WEEK_OF_MONTH, cellCoords.row);
    selectedDate.setTime(_calendar.getTime());
    if ((listener) != null) {
        listener.onDateSelected(selectedDate);
    }
    invalidate();
}