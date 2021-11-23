public void selectMovie(android.view.View view) {
    if (movieList.isEmpty())
        return ;
    
    if ((movieAdapter.mSelectedItem) < 0) {
        return ;
    }
    com.whatever.holidayspecial.Movie currentMovie = movieList.get(movieAdapter.mSelectedItem);
    android.content.Intent intent = new android.content.Intent(this, com.whatever.holidayspecial.Screens.MainScreen.class);
    intent.putExtra("SELECTED_MOVIE", currentMovie);
    setResult(com.whatever.holidayspecial.Screens.RESULT_OK, intent);
    finish();
}