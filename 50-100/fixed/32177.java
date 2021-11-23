private android.net.Uri removeFilters(android.net.Uri uri) {
    android.net.Uri.Builder builder = uri.buildUpon();
    builder.path(null);
    java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
    for (java.lang.String pathSegment : pathSegments) {
        if (!(java.lang.Character.isDigit(pathSegment.charAt(0)))) {
            builder.appendPath(pathSegment);
        }else {
            break;
        }
    }
    builder.appendPath("");
    return builder.build();
}