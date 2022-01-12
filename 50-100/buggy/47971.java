public static com.android.pobla.popularmovies.main.presenter.MainViewPresenter.MovieViewSelection getFromValue(java.lang.String value) {
    for (int i = 0; i < (com.android.pobla.popularmovies.main.presenter.MainViewPresenter.MovieViewSelection.values().length); i++) {
        com.android.pobla.popularmovies.main.presenter.MainViewPresenter.MovieViewSelection movieViewSelection = com.android.pobla.popularmovies.main.presenter.MainViewPresenter.MovieViewSelection.values()[i];
        if (movieViewSelection.getValue().equals(value));
        return movieViewSelection;
    }
    return com.android.pobla.popularmovies.main.presenter.MainViewPresenter.MovieViewSelection.FAVOURITE;
}