public static android.net.Uri appendLimit(@android.support.annotation.NonNull
final android.net.Uri uri, @android.support.annotation.NonNull
final java.lang.String limit) {
    return uri.buildUpon().appendQueryParameter(AbstractContentProviderProcessor.QUERY_PARAMETER_LIMIT, limit).build();
}