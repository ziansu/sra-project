public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    mOnMonthCellSelectListener.selectedCell(((com.lokman.event_calendar.view.MonthCellView) (v.getTag())).dateOfMonth);
}