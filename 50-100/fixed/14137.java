private void createLanguageDialog() {
    org.digitalcampus.oppia.utils.UIUtils.createLanguageDialog(this, course.getLangs(), prefs, new java.util.concurrent.Callable<java.lang.Boolean>() {
        public java.lang.Boolean call() throws java.lang.Exception {
            org.digitalcampus.oppia.activity.CourseIndexActivity.this.onStart();
            return true;
        }
    });
}