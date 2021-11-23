public static com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail getInstance(int movieId) {
    if ((com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail) == null) {
        com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail = new com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail(movieId);
        return com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail;
    }
    return com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail;
}