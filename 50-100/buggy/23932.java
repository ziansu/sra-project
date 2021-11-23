public java.net.HttpURLConnection getGETConnection() throws java.io.IOException {
    java.net.URL url = new java.net.URL(getURL);
    java.net.HttpURLConnection conn = ((java.net.HttpURLConnection) (url.openConnection()));
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    conn.setRequestProperty("Authorization", authorization);
    conn.setUseCaches(false);
    conn.setDoInput(true);
    conn.setDoOutput(true);
    return conn;
}