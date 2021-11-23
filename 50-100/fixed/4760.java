@java.lang.Override
public void showConnectionProblem() {
    org.stepic.droid.util.ProgressHelper.dismiss(progressBarOnEmptyScreen);
    org.stepic.droid.util.ProgressHelper.dismiss(swipeRefreshLayout);
    coursesAdapter.showLoadingFooter(false);
    if (((courses) == null) || (courses.isEmpty())) {
        showEmptyScreen(false);
        reportConnectionProblem.setVisibility(View.VISIBLE);
    }
}