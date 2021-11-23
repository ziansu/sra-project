@java.lang.Override
public int getItemCount() {
    return (mMoviesList) == null ? 0 : mMoviesList.getResults().size();
}