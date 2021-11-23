@android.annotation.TargetApi(value = 14)
public static int getNavigationBarHeight(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity);
    return config.getNavigationBarHeight();
}