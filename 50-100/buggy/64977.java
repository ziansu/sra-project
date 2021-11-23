protected void sendGetData(java.lang.String requestURL, java.lang.String params) {
    try {
        newrequestURL = (requestURL + "?") + params;
        java.net.URL url = new java.net.URL(newrequestURL);
        connection = ((java.net.HttpURLConnection) (url.openConnection()));
    } catch (java.net.MalformedURLException e) {
        android.util.Log.d("MalformedURLException", e.getStackTrace().toString());
    } catch (java.io.IOException e) {
        android.util.Log.d("IOException", e.getStackTrace().toString());
    }
}