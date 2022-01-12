protected void onPostExecute(java.lang.Integer loaderId) {
    if ((isAdded()) && (loaderId != null)) {
        getLoaderManager().restartLoader(loaderId, null, this);
    }
}