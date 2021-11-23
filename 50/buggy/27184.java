@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("lol", "here1");
    com.naman14.timber.permissions.Nammu.askForPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE, permissionReadstorageCallback);
}