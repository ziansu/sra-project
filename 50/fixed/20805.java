public void getMovieInfoByTitle(android.app.Activity activity, java.lang.String title) {
    ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask fetchMovieInfoTask = new ga.neerajdelima.themovieapp.model.network.FetchMovieInfoTask(title);
    fetchMovieInfoTask.delegate = ((ga.neerajdelima.themovieapp.model.network.FetchMovieInfoResponse) (activity));
    fetchMovieInfoTask.execute();
}