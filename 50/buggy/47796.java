public void onStart() {
    super.onStart();
    redgun.moviesstage2.MoviesGridActivity.FetchMoviesTask moviesTask = new redgun.moviesstage2.MoviesGridActivity.FetchMoviesTask(context);
    moviesTask.execute();
}