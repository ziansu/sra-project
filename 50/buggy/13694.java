@android.annotation.TargetApi(value = 14)
public static boolean hasNavigationBar(android.app.Activity activity) {
    com.gyf.barlibrary.BarConfig config = new com.gyf.barlibrary.BarConfig(activity, true, true);
    return config.hasNavigtionBar();
}