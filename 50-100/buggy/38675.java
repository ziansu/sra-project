public void setSelectedDates(java.util.Collection<com.prolificinteractive.materialcalendarview.CalendarDay> dates) {
    for (com.prolificinteractive.materialcalendarview.DayView dayView : dayViews) {
        com.prolificinteractive.materialcalendarview.CalendarDay day = dayView.getDate();
        dayView.generateBackground();
        dayView.setChecked(((dates != null) && (dates.contains(day))));
    }
    postInvalidate();
}