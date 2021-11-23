@java.lang.Override
public void onNavigationDrawerItemSelected(int position) {
    if (!(auth))
        return ;
    
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    if (position == 0) {
        fragmentManager.beginTransaction().replace(R.id.container, tw.edu.ncu.cc.course.ScheduleFragment.newInstance((position + 1))).commit();
    }else {
        fragmentManager.beginTransaction().replace(R.id.container, tw.edu.ncu.cc.course.MainActivity.PlaceholderFragment.newInstance((position + 1))).commit();
    }
}