@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == (RESULT_OK)) {
        android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        mediaScanIntent.setData(mMediaUri);
        sendBroadcast(mediaScanIntent);
    }else
        if (resultCode != (RESULT_CANCELED)) {
            android.widget.Toast.makeText(this, R.string.general_error, Toast.LENGTH_LONG).show();
        }
    
}