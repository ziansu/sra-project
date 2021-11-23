@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    int todayDOW = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK);
    io.github.dramaapppj.android.controller.activity.current.CurrentDramaListFragment fragment = new io.github.dramaapppj.android.controller.activity.current.CurrentDramaListFragment();
    fragment.setDayOfWeek(io.github.dramaapppj.android.model.DayOfWeek.parseFromInt((((todayDOW - 1) + position) % 7)));
    return fragment;
}