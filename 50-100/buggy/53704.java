@java.lang.Override
public void onResume() {
    super.onResume();
    new jp.hazuki.yuzubrowser.settings.activity.ImportExportFragment.PermissionDialog().show(getChildFragmentManager(), "permission");
    if (!(jp.hazuki.yuzubrowser.utils.PermissionUtils.checkWriteStorage(getActivity()))) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            new jp.hazuki.yuzubrowser.settings.activity.ImportExportFragment.PermissionDialog().show(getChildFragmentManager(), "permission");
        }else {
            if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
                requestPermissions(new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
            }
        }
    }
}