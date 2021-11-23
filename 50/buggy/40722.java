@java.lang.Override
public void onDeined(java.lang.String[] dinedPermissions) {
    android.widget.Toast.makeText(this, "无法获取所有权限", Toast.LENGTH_SHORT).show();
    for (java.lang.String permission : dinedPermissions) {
        android.util.Log.e("ss", ("被拒绝的权限:" + permission));
    }
}