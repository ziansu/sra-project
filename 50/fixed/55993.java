private android.content.res.ThemeConfig getThemeConfig() {
    final android.content.res.Configuration config = getConfiguration();
    return config != null ? config.themeConfig : null;
}