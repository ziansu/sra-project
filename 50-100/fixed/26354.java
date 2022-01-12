private static java.lang.String getResponseBody(java.io.InputStream responseStream) throws java.io.IOException {
    java.util.Scanner scanner = new java.util.Scanner(responseStream, com.adyen.httpclient.HttpURLConnectionClient.CHARSET);
    java.lang.String rBody = scanner.useDelimiter("\\A").next();
    scanner.close();
    responseStream.close();
    return rBody;
}