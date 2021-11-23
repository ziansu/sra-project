@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.READ_CONTACTS }, MY_PERMISSIONS_REQUEST_READ_CONTACTS);
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(getContext(), Manifest.permission.READ_CONTACTS)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
    }
}