@java.lang.Override
public void onPause() {
    super.onPause();
    if ((org.digitalcampus.oppia.activity.CourseActivity.myTTS) != null) {
        org.digitalcampus.oppia.activity.CourseActivity.myTTS.shutdown();
        org.digitalcampus.oppia.activity.CourseActivity.myTTS = null;
    }
    org.digitalcampus.oppia.widgets.WidgetFactory currentWidget = ((org.digitalcampus.oppia.widgets.WidgetFactory) (apAdapter.getItem(currentActivityNo)));
    currentWidget.pauseTimeTracking();
    currentWidget.saveTracker();
}