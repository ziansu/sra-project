@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_favorite :
            isFavorite = !(isFavorite);
            if (isFavorite) {
                item.setIcon(R.drawable.ic_favorite_black_24dp);
            }else {
                item.setIcon(R.drawable.ic_favorite_white_24dp);
            }
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}