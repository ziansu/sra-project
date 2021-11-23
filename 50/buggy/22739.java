private void handleRemoveCourses(java.util.List<java.lang.Integer> indices) {
    new nccp.app.ui.CourseListActivity.RemoveCoursesTask(getProgramClass(), indices).execute();
}