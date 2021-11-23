private int getMonthForPosition(int position) {
    return ((DatePickerTimeline.startMonth) + position) % 12;
}