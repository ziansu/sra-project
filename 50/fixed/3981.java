public void changeTargetPassword(java.lang.String targetPersonUUID, java.lang.String password, kornell.api.client.Callback<java.lang.Void> cb) {
    PUT(("/user/changePassword/" + targetPersonUUID)).sendRequest(password, cb);
}