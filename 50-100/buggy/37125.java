@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mFavoriteList.remove(mCurrentSelection);
    updateFavorites();
    final org.tvbrowser.tvbrowser.Favorite current = mCurrentSelection.getFavorite();
    mCurrentSelection = null;
    final android.content.Context context = getActivity().getApplicationContext();
    new java.lang.Thread("DELETE FAVORITE REMOVE MARKING THREAD") {
        public void run() {
            org.tvbrowser.tvbrowser.Favorite.deleteFavorite(context, current);
            mCurrentSelection = null;
        }
    }.start();
}