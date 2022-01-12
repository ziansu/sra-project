@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Integer... pos) {
    de.tap.easy_xkcd.FavoritesFragment.sFavorites = new int[mFav.length];
    for (int i = 0; i < (de.tap.easy_xkcd.FavoritesFragment.sFavorites.length); i++) {
        de.tap.easy_xkcd.FavoritesFragment.sFavorites[i] = java.lang.Integer.parseInt(mFav[i]);
        mComicMap.put(i, new de.tap.easy_xkcd.OfflineComic(de.tap.easy_xkcd.FavoritesFragment.sFavorites[i], getActivity()));
    }
    return null;
}