@java.lang.SuppressWarnings(value = "StatementWithEmptyBody")
@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.nav_gallery)) {
        android.content.Intent openAlbumIntent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
        openAlbumIntent.setType("image/*");
        startActivityForResult(openAlbumIntent, 0);
    }else {
        showProcessorFragment(id);
    }
    android.support.v4.widget.DrawerLayout drawer = ((android.support.v4.widget.DrawerLayout) (findViewById(R.id.drawer_layout)));
    drawer.closeDrawer(GravityCompat.START);
    return true;
}