@android.support.annotation.ColorInt
private static int resolveThemeColor(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.AttrRes
@android.support.annotation.StyleableRes
int attr) {
    return com.heinrichreimersoftware.androidissuereporter.util.ThemeUtils.resolveThemeColors(context, new int[]{ attr }, new int[]{ 0 })[0];
}