@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (felixwiemuth.lincal.ui.AddCalendarActivity.RESULT_CODE_SELECT_FILE)) {
        if (data != null) {
            final int takeFlags = (data.getFlags()) & ((android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION) | (android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION));
            getContentResolver().takePersistableUriPermission(data.getData(), takeFlags);
            fileEditText.setText(data.getDataString());
        }
    }
}