@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)
@java.lang.Override
public void onNotificationRemoved(android.service.notification.StatusBarNotification sbn) {
    if (yogesh.firzen.mukkiasevaigal.P.getBoolean(this, "Autodownload_From_Notification")) {
        java.lang.String pack = sbn.getPackageName();
        if (pack.equals("com.instagram.android")) {
            try {
                org.apache.commons.io.FileUtils.writeStringToFile(new java.io.File(getExternalFilesDir(null), "test.txt"), getAllSbn(sbn), java.nio.charset.Charset.forName("utf-8"));
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
            yogesh.firzen.mukkiasevaigal.M.L("NSaver", getAllSbn(sbn));
        }
    }
}