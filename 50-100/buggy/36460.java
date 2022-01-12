@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = getIntent();
    if ((intent.hasExtra(com.trianguloy.llscript.repository.internal.PermissionActivity.ID)) && (intent.hasExtra(com.trianguloy.llscript.repository.internal.PermissionActivity.PERMISSION))) {
        id = intent.getIntExtra(com.trianguloy.llscript.repository.internal.PermissionActivity.ID, (-1));
        permission = intent.getStringExtra(com.trianguloy.llscript.repository.internal.PermissionActivity.PERMISSION);
        checkForPermission();
    }
    finish();
}