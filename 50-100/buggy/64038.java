@java.lang.Override
protected void onPostExecute(final iweinzierl.github.com.moviedatabase.rest.domain.Movie movie) {
    if ((movie != null) && (!(com.google.common.base.Strings.isNullOrEmpty(movie.getId())))) {
        runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                setMovie(movie);
                stopProgress();
                notifySuccessfullPersistence();
            }
        });
    }
}