public void onResults(android.os.Bundle results) {
    android.util.Log.d(us.nijikon.livelylauncher.VoiceRecognitionService.TAG, "on results");
    java.util.ArrayList<java.lang.String> matches = null;
    if (results != null) {
        matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
        if (matches != null) {
            result = matches.get(0);
            textView.setText(result);
            android.util.Log.d(us.nijikon.livelylauncher.VoiceRecognitionService.TAG, matches.toString());
            speechRecognizer.stopListening();
        }
    }
}