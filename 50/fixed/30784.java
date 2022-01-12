public void setPreferredLocale(java.util.Locale preferredLocale) {
    if (!(java.util.Objects.equals(this.preferredLocale, preferredLocale))) {
        this.preferredLocale = preferredLocale;
        this.manifestXml = null;
        this.apkMeta = null;
    }
}