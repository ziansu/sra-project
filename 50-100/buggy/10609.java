@android.support.annotation.Nullable
static android.net.Uri safeUri(@android.support.annotation.NonNull
java.lang.String url) {
    if (android.text.TextUtils.isEmpty(url)) {
        return null;
    }
    android.net.Uri uri = android.net.Uri.parse(url);
    if (((uri.getHost()) == null) || ((uri.getScheme()) == null)) {
        return null;
    }
    return uri;
}