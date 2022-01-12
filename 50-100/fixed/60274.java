@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    menu.findItem(R.id.action_search).setIcon(new com.mikepenz.iconics.IconicsDrawable(getApplicationContext(), GoogleMaterial.Icon.gmd_search).actionBar().paddingDp(2));
    return true;
}