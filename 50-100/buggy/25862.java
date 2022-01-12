private void finishWithResult(java.io.File file) {
    if (file != null) {
        android.net.Uri uri = android.net.Uri.fromFile(file);
        android.widget.Toast.makeText(this, uri.toString(), Toast.LENGTH_SHORT).show();
        setResult(sharedcode.turboeditor.activity.RESULT_OK, new android.content.Intent().setData(uri));
        finish();
    }else {
        setResult(sharedcode.turboeditor.activity.RESULT_CANCELED);
        finish();
    }
}