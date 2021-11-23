protected void startRecord(final java.lang.String userId) {
    java.lang.String wavString = userId + ".wav";
    java.lang.String rawString = userId + ".raw";
    audioRecordFunc = com.flo.util.AudioRecordFunc.getInstance();
    int result = audioRecordFunc.startRecordAndFile(wavPath, wavString, rawString);
    if (result == 1) {
        com.flo.util.ToastUtil.show(mContext, R.string.audio_error_unknown);
        return ;
    }
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            stopRecord(userId);
            alertDialog.cancel();
        }
    }, 3000);
}