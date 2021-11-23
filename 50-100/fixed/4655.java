@java.lang.Override
public void onDestroy() {
    if ((recognizer) != null)
        recognizer.cancel();
    
    if ((tts_eng) != null) {
        tts_eng.stop();
        tts_eng.shutdown();
    }
    if ((tts) != null) {
        tts.stop();
        tts.shutdown();
    }
    mMediaPlayer.stop();
    mMediaPlayer.release();
    cursor.close();
    myDbHelper.close();
    super.onDestroy();
}