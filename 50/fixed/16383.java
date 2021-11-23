@java.lang.Override
public void itemOnClick(com.wshadow.classschedule.model.entity.Course course) {
    if ((course.getName()) != null) {
        com.wshadow.classschedule.ui.activity.main.MainPresenterImpl.getmView().showCourseInfo(course);
    }
}