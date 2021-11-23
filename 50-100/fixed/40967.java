@android.support.annotation.ColorInt
static int resolveColor(android.content.Context context, @android.support.annotation.AttrRes
int attr, int fallback) {
    if (context != null) {
        android.content.res.TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{ attr });
        try {
            return a.getColor(0, fallback);
        } catch (java.lang.Throwable ignored) {
            return fallback;
        } finally {
            a.recycle();
        }
    }
    return fallback;
}