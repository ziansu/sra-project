public static android.net.Uri normalizeUri(android.net.Uri uri) {
    if (uri == null) {
        return uri;
    }
    android.net.Uri normalized = uri.normalizeScheme();
    if ((normalized.getAuthority()) != null) {
        normalized = normalized.buildUpon().encodedAuthority(normalized.getAuthority().toLowerCase(java.util.Locale.getDefault())).build();
    }
    return android.net.Uri.parse(com.waz.zclient.utils.StringUtils.trimLinkPreviewUrls(normalized));
}