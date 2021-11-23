private void connectTwillio() {
    if (!(twillioPhone.isConnected())) {
        java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
        final java.lang.String name_room = "name_room";
        final java.lang.String token = "token";
        java.lang.String token_local = com.novahub.voipcall.sharepreferences.SharePreferences.getData(getApplicationContext(), SharePreferences.TOKEN);
        params.put(name_room, Asset.nameOfConferenceRoom);
        params.put(token, token_local);
        twillioPhone.connect(params);
        twillioPhone.setSpeakerEnabled(true);
    }
}