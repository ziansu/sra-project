@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case REQ_CODE_SPEECH_INPUT :
            {
                if ((resultCode == (RESULT_OK)) && (null != data)) {
                    java.util.ArrayList<java.lang.String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txtSpeechInput.setText(result.get(0));
                    callPuter(result.get(0));
                }
                break;
            }
    }
}