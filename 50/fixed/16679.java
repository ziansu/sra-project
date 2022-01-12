@android.support.annotation.Nullable
public static java.lang.String getEngineIdentifier(@android.support.annotation.Nullable
final org.mozilla.gecko.search.SearchEngine searchEngine) {
    if (searchEngine == null) {
        return null;
    }
    final java.lang.String identifier = searchEngine.getIdentifier();
    return android.text.TextUtils.isEmpty(identifier) ? null : identifier;
}