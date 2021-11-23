public static android.net.Uri appendDistinct(@android.support.annotation.NonNull
final android.net.Uri uri) {
    if (uri == null) {
        throw new java.lang.IllegalArgumentException("Uri can't be null");
    }
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_DISTINCT, "distinct").build();
}