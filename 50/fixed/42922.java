@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.app.LoaderManager loaderManager = getLoaderManager();
    loaderManager.initLoader(ahmadadam96.comicbookmovies.MainActivity.MOVIE_LOADER_ID, null, this);
}