private void addAllDayRcdTimeslot(david.itimecalendar.calendar.wrapper.WrapperTimeSlot wrapperTimeSlot, david.itimecalendar.calendar.util.MyCalendar calendar) {
    david.itimecalendar.calendar.unitviews.RecommendedSlotView recommendedSlotView = new david.itimecalendar.calendar.unitviews.RecommendedSlotView(getContext(), wrapperTimeSlot, true);
    recommendedSlotView.setBackgroundColor(Color.GREEN);
    recommendedSlotView.setMyCalendar(calendar);
    recommendedSlotView.setOnClickListener(new david.itimecalendar.calendar.calendar.mudules.monthview.DayViewAllDay.OnAllDayRcdTimeslotClick());
    android.widget.FrameLayout.LayoutParams params = new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, allDayTimeslotHeight);
    recommendedSlotView.setLayoutParams(params);
    this.timeslotLayout.addView(recommendedSlotView);
    this.allDaySlots.add(wrapperTimeSlot.getTimeSlot());
}