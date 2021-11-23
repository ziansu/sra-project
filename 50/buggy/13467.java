@android.support.annotation.ColorInt
public static int resolveThemeColor(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.AttrRes
@android.support.annotation.StyleableRes
int attr, @android.support.annotation.ColorInt
int defaultColor) {
    return com.heinrichreimersoftware.androidissuereporter.util.ThemeUtils.resolveThemeColors(context, new int[]{ attr }, new int[]{ defaultColor })[0];
}