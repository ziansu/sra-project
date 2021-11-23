public void returnSpeech(android.content.Intent data) {
    java.util.ArrayList<java.lang.String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
    java.lang.System.err.println(result.get(0));
    modelI.presenter.doneListening(result);
}