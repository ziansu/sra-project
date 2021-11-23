@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if (!(error)) {
        (timePlay)++;
        android.content.Intent intent = new android.content.Intent(com.example.framgianguyenkeninh.gethtml.AppConst.ON_COMPLETED);
        intent.putExtra(AppConst.KEY_TIME_PLAY, timePlay);
        sendBroadcast(intent);
    }
}