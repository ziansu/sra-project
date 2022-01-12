public static android.net.Uri appendProfileWithDefault(final java.lang.String profile, final android.net.Uri uri) {
    if (android.text.TextUtils.isEmpty(profile)) {
        return org.mozilla.gecko.db.DBUtils.appendProfile(GeckoProfile.DEFAULT_PROFILE, uri);
    }
    return org.mozilla.gecko.db.DBUtils.appendProfile(profile, uri);
}