@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    mPermissions = getIntent().getStringArrayExtra(RealTimePermission.KEY_PERMISSIONS);
    if ((mPermissions) == null) {
        net.sarangnamu.common.permission.PermissionActivity.mLog.error("ERROR, PERMISSION == null");
        finish();
        return ;
    }
    requestPermissions();
}