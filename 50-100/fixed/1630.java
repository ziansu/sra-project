public boolean onOptionsItemSelected(final android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_favorite :
            if ((movies) != null)
                new com.ashwinpilgaonkar.popularmovies.Backend.Favorite(getActivity(), movies, item, 1);
            
            return true;
        case R.id.action_share :
            ShareTrailer();
        default :
            return super.onOptionsItemSelected(item);
    }
}