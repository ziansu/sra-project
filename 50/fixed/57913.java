@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course);
    java.lang.String courseName = com.idgi.session.SessionData.getCurrentCourse().getName();
    initializeWithTitle(courseName);
    setupViewPager();
}