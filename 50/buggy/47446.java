public static java.lang.String getPublicPath(android.content.Context context, android.net.Uri uri) throws edu.mit.mobile.android.locast.data.NoPublicPath {
    return edu.mit.mobile.android.locast.data.MediaProvider.getPublicPath(context, uri, null, false);
}