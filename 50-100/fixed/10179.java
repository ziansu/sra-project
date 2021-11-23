@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.editor_layout);
    progressBar = new android.app.ProgressDialog(this);
    progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progressBar.setTitle("Work in Progress");
    progressBar.setCancelable(false);
    progressBar.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            handler.sendEmptyMessage(Utility.STOP_PROGRESS_MSG);
        }
    });
    initUI();
}