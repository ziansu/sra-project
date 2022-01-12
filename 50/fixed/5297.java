private java.lang.CharSequence getDOW(int position) {
    int todayDOW = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK);
    return io.github.dramaapppj.android.controller.activity.current.CurrentPagerAdapter.WEEK_NAME[(((todayDOW - 1) + position) % 7)];
}