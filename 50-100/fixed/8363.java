@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if ((com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.mCallback) != null) {
        if (requestCode == (com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.READ_PERMISSION)) {
            if (com.example.divyanshu.smyt.Utils.PermissionUtil.verifyPermissions(grantResults)) {
                com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.mCallback.onPermissionGranted(com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.PERMISSION_TYPE);
            }else {
                android.util.Log.i("BaseActivity", "permission was NOT granted.");
                com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.mCallback.onPermissionDenied(com.example.divyanshu.smyt.Fragments.RuntimePermissionHeadlessFragment.PERMISSION_TYPE);
            }
        }else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}