@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.mysampleapp.ResultActivity.REQUEST_IMAGE_CAPTURE)) && (resultCode == (RESULT_OK))) {
        new com.mysampleapp.ResultActivity.ProgressTask(this).execute();
        extras = data.getExtras();
    }else {
        super.onActivityResult(requestCode, resultCode, data);
    }
}