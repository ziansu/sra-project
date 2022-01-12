@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    boolean granted = false;
    if ((grantResults.length) > 0) {
        granted = (grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    }
    switch (requestCode) {
        case com.doubleencore.bugreport.BugReport.ENABLE_OBSERVER :
            if (granted)
                com.doubleencore.bugreport.BugReport.enableObserver(this);
            
            break;
        case com.doubleencore.bugreport.BugReport.EXECUTE_COLLECTION :
            if (granted)
                com.doubleencore.bugreport.BugReport.executeCollection(this);
            
            break;
    }
}