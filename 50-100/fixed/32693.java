@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    item.setChecked(true);
    switch (item.getItemId()) {
        case R.id.user_profile_menu :
            break;
        case R.id.team_menu :
            startActivity(new android.content.Intent(this, com.softdesign.devintensive.ui.activities.UserListActivity.class));
            break;
    }
    mNavigationDrawer.closeDrawer(GravityCompat.START);
    return false;
}