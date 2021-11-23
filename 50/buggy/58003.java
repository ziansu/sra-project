@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.user_profile :
            startActivity(new android.content.Intent(this, com.columbasms.columbasms.activity.UserProfileActivity.class));
            break;
    }
    drawer.closeDrawer(GravityCompat.START);
    return true;
}