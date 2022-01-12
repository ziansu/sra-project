private void startForecastsResponse() {
    if (!(com.hillelevo.cityelf.data.UserLocalStore.loadBooleanFromSharedPrefs(getApplicationContext(), Prefs.NOT_FIRST_START))) {
    }else {
        showMessage(address);
        try {
            new com.hillelevo.cityelf.webutils.JsonMessageTask(this).execute(((com.hillelevo.cityelf.Constants.WebUrls.GET_ALL_FORECASTS) + (java.net.URLEncoder.encode(address, "UTF-8"))), Constants.GET);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}