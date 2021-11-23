public static android.view.ContextThemeWrapper getTheme(com.afollestad.materialdialogs.MaterialDialog.Builder builder) {
    boolean darkTheme = (builder.theme) == (Theme.DARK);
    if (!darkTheme) {
        darkTheme = com.afollestad.materialdialogs.util.DialogUtils.resolveBoolean(builder.context, R.attr.md_dark_theme, false);
        builder.theme = (darkTheme) ? Theme.DARK : Theme.LIGHT;
    }
    return new android.view.ContextThemeWrapper(builder.context, (darkTheme ? R.style.MD_Dark : R.style.MD_Light));
}