@java.lang.Override
protected java.util.ArrayList<java.lang.String> doInBackground(java.lang.String... params) {
    java.util.ArrayList<java.lang.String> movieDb = new java.util.ArrayList<java.lang.String>();
    try {
        movieDb = utils.downloadMovie(responseString);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return movieDb;
}