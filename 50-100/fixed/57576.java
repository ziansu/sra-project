private void LogMessage(boolean flag, java.lang.String string) {
    android.util.Log.i(com.lkworm.miniservice.GPSTrackService.TAG, string);
    if (flag) {
        sendMSG(0, (((android.text.format.DateFormat.format("HH.mm.ss", new java.util.Date())) + "\t") + string));
    }
}