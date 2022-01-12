@java.lang.Override
public void onResults(android.os.Bundle results) {
    android.util.Log.d(com.example.jihun.ironman.speech.EnhancedSpeechRecognizer.TAG, "onResult");
    java.util.ArrayList<java.lang.String> results_in_arraylist = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
    for (java.lang.String speech : results_in_arraylist) {
        android.util.Log.d(com.example.jihun.ironman.speech.EnhancedSpeechRecognizer.TAG, ("match: " + speech));
    }
    speech_listener_.onSpeechRecognized(results_in_arraylist);
    asyncStart();
    duplicated_listening_ = false;
    speech_recognized_ = false;
}