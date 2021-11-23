@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case com.app.project.keikkakalenteri.activity.main.MainActivity.ACTIVITY_FINISHED :
            updateCalendarViewPager();
            initializeDateViewPager();
            dateViewPager.setCurrentItem(((selectedDay) - 1));
            break;
    }
}