public void getFilter(android.content.Context c, org.json.JSONArray filteredInstruments) {
    com.melodies.bandup.DatabaseSingleton.getInstance(com.facebook.FacebookSdk.getApplicationContext()).getBandUpDatabase().postInstruments(filteredInstruments, new com.melodies.bandup.listeners.BandUpResponseListener() {
        @java.lang.Override
        public void onBandUpResponse(java.lang.Object response) {
        }
    }, new com.melodies.bandup.listeners.BandUpErrorListener() {
        @java.lang.Override
        public void onBandUpErrorResponse(com.android.volley.VolleyError error) {
        }
    });
}