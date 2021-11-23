@java.lang.Override
public void onInit(int status) {
    if (status != (android.speech.tts.TextToSpeech.ERROR)) {
        tts.setLanguage(java.util.Locale.US);
        myUtteranceProgressListener = new com.nguyenhoangviet.vietnguyen.controllers.Book.MyUtteranceProgressListener(tts, getWordsForReading(), ((long) (activity.getIntPreference(com.nguyenhoangviet.vietnguyen.controllers.Book.BookDetailFragment.WORD_SPEED_INTERVAL, com.nguyenhoangviet.vietnguyen.controllers.Book.BookDetailFragment.DEFAULT_WORD_SPEED_INTERVAL_MS))));
        tts.setOnUtteranceProgressListener(myUtteranceProgressListener);
    }
}