@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_gastro_activity, menu);
    android.view.MenuItem item = menu.findItem(R.id.action_add_favorite);
    boolean isFavorite = org.berlin_vegan.bvapp.GastroLocations.containsFavorite(mGastroLocation.getId());
    if (isFavorite) {
        item.setIcon(getResources().getDrawable(R.mipmap.ic_star_white_24dp));
    }else {
        item.setIcon(getResources().getDrawable(R.mipmap.ic_star_outline_white_24dp));
    }
    return true;
}