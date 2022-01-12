@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    settings = new com.olilay.oplang.Settings(this, isTeacher);
    fragments[2].Refresh(this);
    planManager.initPlans();
    planManager.refreshPlanImages();
    android.view.MenuInflater inflater = getMenuInflater();
    if (isTeacher) {
        inflater.inflate(R.menu.menu_plan_teacher, menu);
    }else {
        inflater.inflate(R.menu.menu_plan_pupil, menu);
    }
    return super.onCreateOptionsMenu(menu);
}