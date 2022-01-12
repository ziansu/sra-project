@java.lang.Override
public void onCompleted(com.iflytek.cloud.SpeechError error) {
    if (error == null) {
        isTtsPlaying = false;
        android.util.Log.d("tts", "播放完成");
        android.widget.Toast.makeText(this, "播放完成", Toast.LENGTH_SHORT).show();
    }else
        if (error != null) {
            android.util.Log.d("tts", error.getPlainDescription(true));
            android.widget.Toast.makeText(this, error.getPlainDescription(true), Toast.LENGTH_SHORT).show();
        }
    
}