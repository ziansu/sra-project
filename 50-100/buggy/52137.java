private void startForecastsResponse() {
    if (!(com.hillelevo.cityelf.data.UserLocalStore.loadBooleanFromSharedPrefs(getApplicationContext(), Prefs.NOT_FIRST_START))) {
    }else {
        java.lang.String address = com.hillelevo.cityelf.data.UserLocalStore.loadStringFromSharedPrefs(getApplicationContext(), Prefs.ADDRESS_1);
        showMessage(address);
        try {
            new com.hillelevo.cityelf.webutils.JsonMessageTask(this).execute(((com.hillelevo.cityelf.Constants.WebUrls.GET_ALL_FORECASTS) + (java.net.URLEncoder.encode(address, "UTF-8"))), Constants.GET);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}