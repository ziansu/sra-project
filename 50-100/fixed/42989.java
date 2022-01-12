private void initDialogAndStartRecord() {
    startTime = java.lang.System.currentTimeMillis();
    recordIndicator = new android.app.Dialog(getContext(), R.style.like_toast_dialog_style);
    com.ygxy.xqm.huli.myview.RecordButton.view = new android.widget.ImageView(getContext());
    com.ygxy.xqm.huli.myview.RecordButton.view.setImageResource(R.drawable.mic_2);
    recordIndicator.setContentView(com.ygxy.xqm.huli.myview.RecordButton.view, new android.view.WindowManager.LayoutParams(android.view.WindowManager.LayoutParams.MATCH_PARENT, android.view.WindowManager.LayoutParams.MATCH_PARENT));
    recordIndicator.setOnDismissListener(onDismiss);
    android.view.WindowManager.LayoutParams lp = recordIndicator.getWindow().getAttributes();
    lp.gravity = android.view.Gravity.CENTER;
    startRecording();
}