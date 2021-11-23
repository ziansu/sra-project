@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
    if (launchIntent != null) {
        startActivity(launchIntent);
    }else {
        com.hrs.filltheform.util.ToastUtil.show(getApplicationContext(), getString(R.string.app_is_not_installed));
    }
}