@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if (hasPermissions(this, PERMISSIONS)) {
        com.pedro.rtmpstreamer.MainActivity.ActivityLink link = activities.get(i);
        int minSdk = link.getMinSdk();
        if ((Build.VERSION.SDK_INT) >= minSdk) {
            startActivity(link.getIntent());
            overridePendingTransition(R.transition.slide_in, R.transition.slide_out);
        }else {
            showMinSdkError(minSdk);
        }
    }else {
        showPermissionsErrorAndRequest();
    }
}