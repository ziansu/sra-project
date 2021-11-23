@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
private void tintNotificationBar(int colorId, java.lang.String name, android.app.Activity activity) {
    activity.getWindow().setStatusBarColor(activity.getResources().getColor(colorId));
}