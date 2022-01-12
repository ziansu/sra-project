@java.lang.Override
protected java.lang.String[] doInBackground(java.lang.String... params) {
    java.lang.String[] movieDb = new java.lang.String[30];
    try {
        movieDb = utils.downloadMovie(responseString);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return movieDb;
}