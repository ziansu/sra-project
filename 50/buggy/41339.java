public static boolean confirmRequest(android.net.Uri uri, java.lang.String request) {
    return uri.getPathSegments().get(3).equals(request);
}