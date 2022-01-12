private void startCalendarFiltersScreen() {
    android.os.Bundle analyticsBundle = new android.os.Bundle();
    analyticsBundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Calendar filters click");
    firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, analyticsBundle);
    android.content.Intent intent = new android.content.Intent(getActivity(), co.techmagic.hr.presentation.ui.activity.CalendarFiltersActivity.class);
    intent.putExtra(CalendarFiltersActivity.SEL_MY_TEAM_EXTRA, isMyTeamChecked);
    intent.putExtra(CalendarFiltersActivity.SEL_FROM_DATE_EXTRA, fromInMillis);
    intent.putExtra(CalendarFiltersActivity.SEL_TO_DATE_EXTRA, toInMillis);
    intent.putExtra(CalendarFiltersActivity.SEL_DEP_ID_EXTRA, selDepId);
    intent.putExtra(CalendarFiltersActivity.SEL_PROJECT_ID_EXTRA, selProjectId);
    startActivityForResult(intent, CalendarFiltersActivity.CALENDAR_FILTERS_ACTIVITY_REQUEST_CODE);
}