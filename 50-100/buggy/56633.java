private void getState() {
    com.shanejansen.thelodge.data.DataManager.refreshDevices(this, new com.shanejansen.thelodge.data.DataManager.NetworkInf<java.util.List<com.shanejansen.thelodge.data.Device>>() {
        @java.lang.Override
        public void onCompleted(final List<com.shanejansen.thelodge.data.Device> devices) {
            com.shanejansen.thelodge.data.DataManager.setupGoogleApiClient(com.shanejansen.thelodge.data.WearMessageListenerService.this, new com.shanejansen.thelodge.data.DataManager.NetworkInf<com.google.android.gms.common.api.GoogleApiClient>() {
                @java.lang.Override
                public void onCompleted(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
                    com.google.gson.Gson gson = new com.google.gson.Gson();
                    java.lang.String json = gson.toJson(devices);
                    com.shanejansen.thelodge.data.DataManager.sendWearMessage(googleApiClient, MainFragment.WEAR_GET_STATE, json);
                }
            });
        }
    });
}