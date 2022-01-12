@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    try {
        this.json = new org.json.JSONObject(savedInstanceState.getString("json"));
        java.util.ArrayList<org.digitalcampus.oppia.model.Course> savedCourses = ((java.util.ArrayList<org.digitalcampus.oppia.model.Course>) (savedInstanceState.getSerializable("courses")));
        this.courses.addAll(savedCourses);
    } catch (java.lang.Exception e) {
    }
    tasksController = ((org.digitalcampus.oppia.task.DownloadTasksController) (savedInstanceState.getParcelable("tasksProgress")));
}