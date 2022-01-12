private void initialisePresenter(boolean firstLoad) {
    if (firstLoad) {
        presenter = createPresenter();
    }else {
        presenter = ((P) (com.vincenttetau.weatherapp.activities.BaseActivity.getLastCustomNonConfigurationInstance()));
    }
}