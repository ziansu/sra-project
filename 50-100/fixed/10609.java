@android.support.annotation.Nullable
static android.net.Uri safeUri(@android.support.annotation.NonNull
java.lang.String url) {
    if (android.text.TextUtils.isEmpty(url)) {
        return null;
    }
    android.net.Uri uri = android.net.Uri.parse(url);
    if ((android.text.TextUtils.isEmpty(uri.getScheme())) || (android.text.TextUtils.isEmpty(uri.getHost()))) {
        return null;
    }
    return uri;
}