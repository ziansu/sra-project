@java.lang.Override
public int getItemCount() {
    if (((mMoviePosters) == null) || ((mMoviePosters.size()) == 0)) {
        return 0;
    }
    return mMoviePosters.size();
}