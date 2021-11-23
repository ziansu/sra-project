protected static boolean isNightMode(android.content.Context context) {
    int currentNightMode = (context.getResources().getConfiguration().uiMode) & (android.content.res.Configuration.UI_MODE_NIGHT_MASK);
    return currentNightMode == (android.content.res.Configuration.UI_MODE_NIGHT_YES);
}