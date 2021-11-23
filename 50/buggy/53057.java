private void restartLoader() {
    android.util.Log.d("add book", "in restartLoader");
    getLoaderManager().restartLoader(LOADER_ID, null, this);
}