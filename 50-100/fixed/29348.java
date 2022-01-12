private void startCalendarFiltersScreen() {
    android.content.Intent intent = new android.content.Intent(getActivity(), co.techmagic.hr.presentation.ui.activity.CalendarFiltersActivity.class);
    intent.putExtra(CalendarFiltersActivity.SEL_MY_TEAM_EXTRA, isMyTeamChecked);
    intent.putExtra(CalendarFiltersActivity.SEL_FROM_DATE_EXTRA, fromInMillis);
    intent.putExtra(CalendarFiltersActivity.SEL_TO_DATE_EXTRA, toInMillis);
    intent.putExtra(CalendarFiltersActivity.SEL_DEP_ID_EXTRA, selDepId);
    intent.putExtra(CalendarFiltersActivity.SEL_PROJECT_ID_EXTRA, selProjectId);
    startActivityForResult(intent, CalendarFiltersActivity.CALENDAR_FILTERS_ACTIVITY_REQUEST_CODE);
}