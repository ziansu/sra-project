public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    if ((movies) != null) {
        inflater.inflate(R.menu.menu_detail, menu);
        final android.view.MenuItem favorite = menu.findItem(R.id.action_favorite);
        new com.ashwinpilgaonkar.popularmovies.Backend.Favorite(getActivity(), movies, favorite, 0);
    }
}