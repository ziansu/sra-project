public void speakAloud(android.view.View v) {
    if ((currVocab.getSpeech()) != null) {
        playSound(currVocab.getSpeech());
    }else {
        com.example.sco.imuvo.HelperClasses.WebServiceHelper webServiceHelper = new com.example.sco.imuvo.HelperClasses.WebServiceHelper();
        webServiceHelper.setWebServiceHelperListener(new com.example.sco.imuvo.HelperClasses.WebServiceHelperListener() {
            @java.lang.Override
            public void onWebServiceReturnResult(byte[] result) {
                currVocab.setSpeech(result);
                com.example.sco.imuvo.HelperClasses.VocabDatabaseHelper.update(currVocab);
                playSound(result);
            }
        });
        webServiceHelper.getSpeechAsync(currVocab);
    }
}