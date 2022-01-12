@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
public static void tintNotificationBar(int colorId, android.app.Activity activity) {
    activity.getWindow().setStatusBarColor(activity.getResources().getColor(colorId));
}