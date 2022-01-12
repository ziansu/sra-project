public static boolean pingURL(java.lang.String url, int timeout) {
    try {
        java.net.HttpURLConnection connection = ((java.net.HttpURLConnection) (new java.net.URL(url).openConnection()));
        connection.setConnectTimeout(timeout);
        connection.setReadTimeout(timeout);
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        return (200 <= responseCode) && (responseCode <= 399);
    } catch (java.io.IOException exception) {
        exception.printStackTrace();
        return false;
    }
}