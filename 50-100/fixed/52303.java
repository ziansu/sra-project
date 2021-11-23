@java.lang.Override
protected void onProgressUpdate(java.lang.String... message) {
    super.onProgressUpdate(message);
    int percentComplete = 0;
    percentComplete = java.lang.Integer.parseInt(message[1]);
    dialog.setMessage(message[0]);
    dialog.setProgress(percentComplete);
    dialog.show();
}