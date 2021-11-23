public static java.lang.String text(android.content.Context c, @android.support.annotation.StringRes
int res, java.lang.String... args) {
    android.content.res.Resources resources = c.getResources();
    return (args.length) == 0 ? resources.getString(res) : resources.getString(res, ((java.lang.Object[]) (args)));
}