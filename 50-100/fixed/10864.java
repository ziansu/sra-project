@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    new android.app.AlertDialog.Builder(getActivity()).setTitle("Scanned Message").setMessage(rawResult.getText()).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            resumeCamera();
        }
    }).create().show();
}