void setPrefs(final de.blau.android.prefs.Preferences prefs) {
    this.prefs = prefs;
    de.blau.android.resources.DataStyle.setAntiAliasing(prefs.isAntiAliasingEnabled());
    map.invalidate();
}