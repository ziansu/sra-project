@java.lang.Override
public void displaySurveyError() {
    android.view.View coordinatorLayout = getRootView().findViewById(R.id.coordinator_layout);
    snackBarManager.displaySnackBar(coordinatorLayout, R.string.surveys_error, getContext());
}