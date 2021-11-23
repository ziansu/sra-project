@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case br.com.cpqd.demo.activity.MainActivity.REQUEST_PERMISSION :
            if ((grantResults.length) > 0) {
                boolean pemissionsGranted = true;
                for (int results : grantResults) {
                    if (results != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
                        pemissionsGranted = false;
                        break;
                    }
                }
                if (!pemissionsGranted) {
                    finish();
                }
            }
            break;
    }
}