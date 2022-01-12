public void onResults(android.os.Bundle results) {
    android.util.Log.d(us.nijikon.livelylauncher.VoiceRecognitionService.TAG, "on results");
    java.util.ArrayList<java.lang.String> matches = null;
    if (results != null) {
        matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
        if (matches != null) {
            textView.setText(matches.get(0));
            android.util.Log.d(us.nijikon.livelylauncher.VoiceRecognitionService.TAG, matches.toString());
            speechRecognizer.stopListening();
        }
    }
}