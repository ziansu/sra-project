@org.androidannotations.annotations.AfterViews
protected void initialize() {
    setDetailsActivityActionBar();
    city = new com.activeandroid.query.Select().from(com.piotr.localweather.model.City.class).executeSingle();
    item = new com.activeandroid.query.Select().from(com.piotr.localweather.model.ForecastItem.class).where("id = ?", id).executeSingle();
    if (((item) != null) && ((city) != null)) {
        android.util.Log.d(TAG, item.toString());
        getDetailActivityViewsValues(item, city);
        setDetailActivityViewsValues();
    }
}