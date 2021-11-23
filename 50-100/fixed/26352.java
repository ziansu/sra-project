public android.view.View makeView() {
    ee.ttu.schedule.calendar.DayView view = new ee.ttu.schedule.calendar.DayView(getActivity(), ee.ttu.schedule.calendar.CalendarController.getInstance(getActivity()), mViewSwitcher, mEventLoader, mNumDays);
    view.setId(android.view.View.generateViewId());
    view.setLayoutParams(new android.widget.ViewSwitcher.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.MATCH_PARENT));
    return view;
}