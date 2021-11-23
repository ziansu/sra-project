@org.testng.annotations.Test(dependsOnMethods = "verify_if_new_course_popup_window_closes")
public void Admin_creates_new_Course() throws java.io.IOException, java.lang.InterruptedException {
    java.lang.Thread.sleep(1000);
    dashbtest.create_newcourse(true);
}