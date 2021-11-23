@com.facebook.react.bridge.ReactMethod
public void stop() {
    showTip(("mIse.isEvaluating()=" + (mIse.isEvaluating())));
    if (mIse.isEvaluating()) {
        mIse.stopEvaluating();
        showTip(("mIse.isEvaluating()=" + (mIse.isEvaluating())));
    }
    hideDialog();
    commonEvent(com.lixl.waveform.WaveformViewModule.EVENT_KEY_CONFIRM);
}