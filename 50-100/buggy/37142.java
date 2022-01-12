public java.util.List<com.sid.kubra.jsondemoapp.model.User> requestUsersList() {
    try {
        java.lang.String requestUrl = (com.sid.kubra.jsondemoapp.restclient.JsonPlaceRestClient.baseUrl) + "/users";
        java.lang.String jsonString = performGetRequest(requestUrl);
        android.util.Log.d(com.sid.kubra.jsondemoapp.restclient.JsonPlaceRestClient.TAG, ("Json response: " + jsonString));
        return parseUserList(jsonString);
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.sid.kubra.jsondemoapp.restclient.JsonPlaceRestClient.TAG, ("Error - request users list: " + (e.getMessage())));
    }
    return null;
}