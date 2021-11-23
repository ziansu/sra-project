private int getMonthForPosition(int position) {
    return (position % 12) + (DatePickerTimeline.startMonth);
}