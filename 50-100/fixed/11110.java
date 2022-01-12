public void scan() {
    if (!(checkLoginStatus())) {
        return ;
    }
    if (!(checkNet())) {
        return ;
    }
    android.content.Intent scan_int = new android.content.Intent(context, com.zbar.lib.CaptureActivity.class);
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (context));
    activity.startActivityForResult(scan_int, wale_tech.tryon.ScanAction.REQUEST_MAIN);
}