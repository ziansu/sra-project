@java.lang.Override
public void onEndOfSpeech() {
    showLog("onEndOfSpeech");
    if ((mRecognitionListener) != null) {
        if (((mRecognizedString) != null) && (mCommandsList.contains(mRecognizedString))) {
            mRecognitionListener.onCommandRecognized(mRecognizedString);
            pauseRecognition();
            mRecognitionListener.onRecognitionFinished(new java.lang.String(mRecognizedString));
            showLog(("recognized text = " + (mRecognizedString)));
            mRecognizedString = null;
        }
    }
}