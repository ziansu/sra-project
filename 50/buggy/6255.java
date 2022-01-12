@java.lang.Override
public int getItemCount() {
    if (mMoviesList.isEmpty()) {
        return 0;
    }
    return mMoviesList.size();
}