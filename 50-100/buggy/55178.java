@java.lang.Override
public void run() {
    if ((list.size()) != 0) {
        org.greenrobot.eventbus.EventBus.getDefault().post(new cn.edu.jxnu.awesome_campus.event.EventModel<cn.edu.jxnu.awesome_campus.model.home.CourseTableModel>(cn.edu.jxnu.awesome_campus.event.EVENT.COURSE_TABLE_LOAD_CACHE_SUCCESS, list));
    }else {
        org.greenrobot.eventbus.EventBus.getDefault().post(new cn.edu.jxnu.awesome_campus.event.EventModel<cn.edu.jxnu.awesome_campus.model.home.CourseTableModel>(cn.edu.jxnu.awesome_campus.event.EVENT.COURSE_TABLE_LOAD_CACHE_FAILURE));
    }
}