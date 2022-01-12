@java.lang.Override
public void expandAddScreen() {
    mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    mBottomSheetTextView.setVisibility(View.INVISIBLE);
    switch (mBottomSheetNavigationView.getSelectedItemId()) {
        case R.id.main_bottom_sheet_navigation_calendar :
            me.kholmukhamedov.organizer.ui.fragment.calendar.CalendarFragment calendarFragment = ((me.kholmukhamedov.organizer.ui.fragment.calendar.CalendarFragment) (mFragmentsMap.get(CalendarFragment.TAG)));
            if (calendarFragment != null)
                calendarFragment.hideCalendarView();
            
            break;
    }
}