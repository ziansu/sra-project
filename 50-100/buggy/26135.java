@org.androidannotations.annotations.AfterViews
protected void init() {
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(com.udacity.mauricio.popularmovies.gui.view.DetailActivity.EXTRA_MOVIE, movie);
    com.udacity.mauricio.popularmovies.gui.view.MovieDetailFragment fragment = new com.udacity.mauricio.popularmovies.gui.view.MovieDetailFragment_();
    fragment.setArguments(args);
    getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
}