public static java.util.prefs.Preferences getLegacyPreferences14(java.util.prefs.Preferences root) {
    try {
        if (!(root.nodeExists("org"))) {
            return null;
        }
        root = root.node("org");
        if (!(root.nodeExists("micromanager"))) {
            return null;
        }
        return root.node("micromanager");
    } catch (java.util.prefs.BackingStoreException e) {
        org.micromanager.internal.utils.ReportingUtils.logError(e, "Error accessing old user preferences");
        return null;
    }
}