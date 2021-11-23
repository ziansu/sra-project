@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if (0 == (msg.what)) {
        android.util.Log.i(com.example.percentlinearlayout.AudioActivity.TAG, "startSeekBar+");
        if (null == (m_MusicPlayerService)) {
            return ;
        }
        m_SeekBar.setMax(mediaPlayer.getDuration());
        android.util.Log.i(com.example.percentlinearlayout.AudioActivity.TAG, (((com.example.percentlinearlayout.AudioActivity.TAG) + "getCurrentPosition :") + (mediaPlayer.getCurrentPosition())));
        m_SeekBar.setProgress(mediaPlayer.getCurrentPosition());
        sendToMessage();
    }
}