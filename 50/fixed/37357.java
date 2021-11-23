@java.lang.Override
public void update() {
    if ((mCityAdapter) != null) {
        mCityAdapter.clearData();
    }
    mPresenter.loadCitiesFromDatabase();
}