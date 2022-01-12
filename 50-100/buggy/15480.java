@java.lang.Override
public void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultData != null) {
        java.util.ArrayList<xyz.belvi.permissiondialog.Permission.SmoothPermission> smoothPermissions = resultData.getParcelableArrayList(RationaleDialog.SMOOTH_PERMISSIONS);
        if (resultCode == (RationaleDialog.PERMISSION_RESOLVE)) {
            android.util.Log.e("size", ("" + (smoothPermissions.size())));
            setResult(resultCode, new android.content.Intent().putExtra("data", resultData));
            finish();
        }
    }else {
        finish();
    }
}