@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.schedule)) {
    }else
        if (id == (R.id.stats)) {
            final android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.project.itmo2016.edutrackerapplication.StatsActivity.class);
            intent.putExtra(com.project.itmo2016.edutrackerapplication.ScheduleActivity.EXTRA_PATH_TO_STATS, pathToStats);
            startActivity(intent);
        }
    
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}