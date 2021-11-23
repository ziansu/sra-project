private void finishWithResult(java.io.File file) {
    if (file != null) {
        android.net.Uri uri = android.net.Uri.fromFile(file);
        setResult(sharedcode.turboeditor.activity.RESULT_OK, new android.content.Intent().setData(uri));
        finish();
    }else {
        setResult(sharedcode.turboeditor.activity.RESULT_CANCELED);
        finish();
    }
}