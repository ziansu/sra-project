@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.util.Log.v(LOG_TAG, "onActivityCreated: initLoader");
    getLoaderManager().initLoader(com.example.shreekant.sunshine.app.ForecastFragment.FORECAST_LOADER_ID, null, this);
}