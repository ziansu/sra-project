public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case Run.VOICE_RECOGNITION_REQUEST_CODE :
            if (resultCode == (RESULT_OK)) {
                Run.sttResults = new java.util.ArrayList<java.lang.String>();
                Run.sttResults = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            }
            Run.sttDone = true;
            android.util.Log.v(com.rfo.basic.Web.LOGTAG, ((" " + (com.rfo.basic.Web.CLASSTAG)) + " VR Done"));
    }
}