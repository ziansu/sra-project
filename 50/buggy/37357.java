@java.lang.Override
public void update() {
    mCityAdapter.clearData();
    mPresenter.loadCitiesFromDatabase();
}