@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    movie = getIntent().getParcelableExtra(com.floatingmuseum.mocloud.ui.mainmovie.detail.MovieDetailActivity.MOVIE_OBJECT);
    presenter = new com.floatingmuseum.mocloud.ui.mainmovie.detail.MovieDetailPresenter(this);
    com.orhanobut.logger.Logger.d(((("电影名onCreate:" + (movie.getTitle())) + "...") + (movie.getId())));
    presenter.getData(movie);
    initView();
}