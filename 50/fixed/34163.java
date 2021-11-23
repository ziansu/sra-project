public void clear() {
    if ((mMovieList) != null) {
        mMovieList.clear();
        notifyDataSetChanged();
    }
}