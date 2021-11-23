@java.lang.Override
public java.lang.String export(@android.support.annotation.NonNull
java.lang.String word, @android.support.annotation.Nullable
java.lang.String filter, @android.support.annotation.NonNull
java.util.List<ca.rmen.android.poetassistant.main.dictionaries.rt.RTEntry> entries) {
    final java.lang.String title = mContext.getString(R.string.share_favorites_title, word);
    java.lang.StringBuilder builder = new java.lang.StringBuilder(title);
    for (ca.rmen.android.poetassistant.main.dictionaries.rt.RTEntry entry : entries) {
        builder.append(mContext.getString(R.string.share_rt_entry, entry.text));
    }
    return builder.toString();
}