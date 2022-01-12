@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_liveboard :
            setView(be.hyperrail.android.MainActivity.VIEW_TYPE_LIVEBOARD, null);
            break;
        case R.id.action_route :
            setView(be.hyperrail.android.MainActivity.VIEW_TYPE_ROUTE, null);
            break;
        case R.id.action_disturbances :
            setView(be.hyperrail.android.MainActivity.VIEW_TYPE_DISTURBANCE, null);
            break;
        case R.id.action_settings :
            android.content.Intent i = new android.content.Intent(this, be.hyperrail.android.SettingsActivity.class);
            startActivity(i);
            break;
    }
    if (!(mDualPane)) {
        vDrawerLayout.closeDrawers();
    }
    return true;
}