@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    com.iven.i7helper.util.LocationUtil lu = com.iven.i7helper.util.LocationUtil.getLocationUtil();
    switch (requestCode) {
        case 1 :
            if ((grantResults.length) > 0) {
                for (int i : grantResults) {
                    if (i != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                        com.iven.i7helper.util.ToolUtil.showMessage(this, "不给权限会导致记录不准确");
                        return ;
                    }
                }
            }
            lu.requestLocation();
            break;
        default :
    }
}