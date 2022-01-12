@java.lang.Override
public void onEndOfSpeech() {
    showLog("onEndOfSpeech");
    if ((mRecognitionListener) != null) {
        if (((mRecognizedString) != null) && (mCommandsList.contains(mRecognizedString))) {
            mRecognitionListener.onCommandRecognized(mRecognizedString);
            pauseRecognition();
            mRecognitionListener.onRecognitionFinished(mRecognizedString);
        }
    }
    showLog(("recognized text = " + (mRecognizedString)));
}