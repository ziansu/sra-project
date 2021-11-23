@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.mysampleapp.ResultActivity.REQUEST_IMAGE_CAPTURE)) && (resultCode == (RESULT_OK))) {
        extras = data.getExtras();
        new com.mysampleapp.ResultActivity.ProgressTask(this).execute();
    }else {
        super.onActivityResult(requestCode, resultCode, data);
    }
}