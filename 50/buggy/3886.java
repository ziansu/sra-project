public static android.net.Uri appendLimit(@android.support.annotation.NonNull
final android.net.Uri uri, @android.support.annotation.NonNull
final java.lang.String limit) {
    if (uri == null) {
        throw new java.lang.IllegalArgumentException("Uri can't be null");
    }
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_LIMIT, limit).build();
}