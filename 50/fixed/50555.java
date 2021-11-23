public static com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail getInstance(int movieId) {
    com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail = new com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail(movieId);
    return com.app.bigshows.fragments.home.in_theater.NowPlayingMovieDetail.mNowPlayingMovieDetail;
}