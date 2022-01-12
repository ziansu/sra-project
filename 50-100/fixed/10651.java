private boolean initConnection() {
    try {
        java.net.URL url = new java.net.URL("http", Constants.SERVER, 3000, Constants.DATA_POST_URL);
        httpConnection = ((java.net.HttpURLConnection) (url.openConnection()));
        httpConnection.setRequestProperty("Accept", "application/json");
        httpConnection.setRequestProperty("Content-type", "application/json");
        httpConnection.setRequestMethod("POST");
        httpConnection.setDoOutput(true);
        httpConnection.connect();
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}