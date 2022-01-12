private void doWhenResponseIsUnsuccessful(java.net.HttpURLConnection httpURLConnection) {
    java.io.InputStream is;
    is = httpURLConnection.getErrorStream();
}