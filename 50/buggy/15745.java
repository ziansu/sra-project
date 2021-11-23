protected static java.lang.String convertStreamToString(java.io.InputStream inputStream) {
    java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
}