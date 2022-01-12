@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Context context = getApplicationContext();
    if (((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        return ;
    }
    lm.removeUpdates(mylbslistener);
    if ((lm) != null) {
        lm = null;
    }
    textstate.setText("已经关闭记录位置功能，如需记录，请点击开始记录");
}