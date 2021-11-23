public java.util.List<xyz.codingmentor.model.MovieStar> findMovieStarTitleName(java.lang.String movieTitle, java.lang.String movieStarName) {
    if ((null != movieTitle) && (null != movieStarName)) {
        return findMovieStarsForMovieOrName(movieTitle, movieStarName);
    }
    if ((null != movieTitle) && (null == movieStarName)) {
        return findMovieStarForMovie(movieTitle);
    }
    if ((null == movieTitle) && (null != movieStarName)) {
        return findMovieStarsName(movieStarName);
    }
    throw new java.lang.IllegalArgumentException("Need at least one query param!");
}