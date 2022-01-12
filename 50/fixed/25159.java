public static cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod fromString(java.lang.String string) {
    cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod method = null;
    if (string != null) {
        try {
            method = cz.metaverse.android.bilingualreader.enums.ScrollSyncMethod.valueOf(string);
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
    return method;
}