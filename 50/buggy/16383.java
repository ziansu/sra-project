@java.lang.Override
public void itemOnClick(com.wshadow.classschedule.model.entity.Course course) {
    com.wshadow.classschedule.ui.activity.main.MainPresenterImpl.getmView().showCourseInfo(course);
}