@java.lang.Override
public void onResult(com.iflytek.cloud.EvaluatorResult result, boolean isLast) {
    android.util.Log.d(com.lixl.waveform.WaveformViewModule.TAG, ("evaluator result :" + isLast));
    if (isLast) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(result.getResultString());
        if (!(android.text.TextUtils.isEmpty(builder))) {
        }
        mLastResult = builder.toString();
        alert("评测结束");
        hideDialog();
        commonEvent(com.lixl.waveform.WaveformViewModule.EVENT_KEY_CONFIRM);
    }else {
        showTip("测评进行中");
    }
}