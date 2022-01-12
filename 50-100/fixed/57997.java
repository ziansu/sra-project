private void drawYearPickerView() {
    calendar = java.util.Calendar.getInstance(locale);
    final int yearCount = (maxYear) - (minYear);
    for (int i = 0; i < yearCount; i++) {
        calendar.set(java.util.Calendar.YEAR, ((minYear) + i));
        years.add(i, io.blackbox_vision.wheelview.utils.DateUtils.formatDate(calendar, io.blackbox_vision.wheelview.view.DatePickerWheelView.YEAR_FORMAT));
    }
    yearSpinner.setItems(years);
}