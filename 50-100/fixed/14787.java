public static int getTheme(com.afollestad.materialdialogs.MaterialDialog.Builder builder) {
    boolean darkTheme = com.afollestad.materialdialogs.util.DialogUtils.resolveBoolean(builder.context, R.attr.md_dark_theme, ((builder.theme) == (Theme.DARK)));
    builder.theme = (darkTheme) ? Theme.DARK : Theme.LIGHT;
    return darkTheme ? R.style.MD_Dark : R.style.MD_Light;
}