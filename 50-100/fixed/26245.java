public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case Run.VOICE_RECOGNITION_REQUEST_CODE :
            if (resultCode == (RESULT_OK)) {
                Run.sttResults = new java.util.ArrayList<java.lang.String>();
                Run.sttResults = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            }
            Run.sttDone = true;
    }
}