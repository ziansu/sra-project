public void closeSurveyFragment() {
    surveyFragment.unregisterReceiver();
    initAssess();
    unsentFragment.reloadData();
    setActionBarDashboard();
}