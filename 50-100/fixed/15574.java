@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.Action1 :
            startActivity(new android.content.Intent(this, com.wein3.weinapp.GPSTester.class));
            break;
        case R.id.Action2 :
            startActivity(new android.content.Intent(this, com.wein3.weinapp.DBContent.class));
            break;
        case R.id.Action3 :
            stopService(intent);
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}