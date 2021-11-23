@android.support.annotation.Nullable
public static java.lang.String getEngineIdentifier(final org.mozilla.gecko.search.SearchEngine searchEngine) {
    final java.lang.String identifier = searchEngine.getIdentifier();
    return android.text.TextUtils.isEmpty(identifier) ? null : identifier;
}