private void fetchData() throws org.json.JSONException {
    android.util.Log.d(LOG_TAG, "Start fetchData");
    switch (mode) {
        case 0 :
            fetchTotalStatistics();
            break;
        case 1 :
            fetchUpdatesForDictionaries();
            break;
        case 2 :
            fetchSitesDictionaryUpdate();
            break;
        case 3 :
            fetchPersonsDictionaryUpdate();
            break;
        case 4 :
            fetchDailyStatistics();
            break;
    }
}