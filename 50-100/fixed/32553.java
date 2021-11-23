public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_popular)) {
        com.global.oakdays.popularmoviesapp.MainActivity.FILTER = "popular";
    }else
        if (id == (R.id.action_top_rated)) {
            com.global.oakdays.popularmoviesapp.MainActivity.FILTER = "top_rated";
        }
    
    com.global.oakdays.popularmoviesapp.PopularMoviesTask popularMoviesTask = new com.global.oakdays.popularmoviesapp.PopularMoviesTask(movieAdapter);
    popularMoviesTask.execute(com.global.oakdays.popularmoviesapp.MainActivity.FILTER);
    return super.onOptionsItemSelected(item);
}