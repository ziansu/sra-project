private void onFavoritesChanged() {
    android.database.Cursor c = getActivity().getContentResolver().query(MovieContract.MovieEntry.CONTENT_URI, null, null, null, null);
    mAdapter.swapCursor(c);
}