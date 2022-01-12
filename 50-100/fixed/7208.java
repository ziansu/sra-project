@java.lang.Override
public void onError(com.iflytek.cloud.SpeechError error) {
    if (error != null) {
        showTip(((("error:" + (error.getErrorCode())) + ",") + (error.getErrorDescription())));
    }else {
        android.util.Log.d(com.lixl.waveform.WaveformViewModule.TAG, "evaluator over");
    }
}