@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    geolocationService.processResults(response);
    mSharedPreferences = this.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
    mFormattedAddress = mSharedPreferences.getString("location", null);
    getDrinkPlaces(mFormattedAddress);
}