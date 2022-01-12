@java.lang.Override
public void onError(int error) {
    m_listener.onError(com.shaedar.virtualclient.VoiceEngine.GoogleRecognizer.getErrorText(error));
}