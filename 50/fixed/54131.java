@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    error = true;
    android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_ERROR_PREPARE);
    sendBroadcast(intent);
    return false;
}