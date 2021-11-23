@java.lang.Override
public void onResults(android.os.Bundle results) {
    java.util.List<java.lang.String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
    m_listener.onRecognitionDone(data);
}