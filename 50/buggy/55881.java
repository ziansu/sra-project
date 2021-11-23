@java.lang.Override
public void onEndOfSpeech() {
    showTip("结束说话");
    if (mIsRecognizer) {
        mIat.startListening(mRecognizerListener);
    }
}