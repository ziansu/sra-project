@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case REQ_CODE_SPEECH_INPUT :
            {
                if ((resultCode == (RESULT_OK)) && (null != data)) {
                    java.util.ArrayList<java.lang.String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    speechInputHandler.handleSpeech(result);
                }
                break;
            }
        case BACK_TO_MAP :
            setResult(BACK_TO_MAP);
            finish();
            break;
    }
}