@java.lang.Override
protected void onResume() {
    android.util.Log.v(LOG_TAG, "onResume()");
    super.onResume();
    java.lang.String prefLocation = com.example.shreekant.sunshine.app.Utility.getPreferredLocation(this);
    if (!(mLocation.equals(prefLocation))) {
        android.util.Log.v(LOG_TAG, ("onResume(): New Location " + prefLocation));
        mLocation = prefLocation;
        com.example.shreekant.sunshine.app.ForecastFragment ff = ((com.example.shreekant.sunshine.app.ForecastFragment) (getSupportFragmentManager().findFragmentByTag(com.example.shreekant.sunshine.app.MainActivity.FORECASTFRAGMENT_TAG)));
        ff.onLocationChanged();
    }
    com.example.shreekant.sunshine.app.ViewServer.get(this).setFocusedWindow(this);
}