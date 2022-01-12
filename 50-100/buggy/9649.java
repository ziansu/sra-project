public void updateTheme() {
    this.primaryColor = SP.getInt("primary_color", android.support.v4.content.ContextCompat.getColor(getApplicationContext(), R.color.md_indigo_500));
    this.accentColor = SP.getInt("accent_color", android.support.v4.content.ContextCompat.getColor(getApplicationContext(), R.color.md_light_blue_500));
    darkTheme = SP.getBoolean("set_dark_theme", false);
    coloredNavBar = SP.getBoolean("nav_bar", false);
    oscuredStatusBar = SP.getBoolean("set_traslucent_statusbar", true);
    applyThemeImgAct = SP.getBoolean("apply_theme_img_act", false);
}