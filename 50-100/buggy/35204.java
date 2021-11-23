@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.i(course.labs.intentslab.ActivityLoaderActivity.TAG, "Entered onActivityResult()");
    if ((requestCode == (course.labs.intentslab.ActivityLoaderActivity.GET_TEXT_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        android.content.Intent handle = getIntent();
        java.lang.String finalResult = handle.getExtras().getString(course.labs.intentslab.ActivityLoaderActivity.TAG);
        mUserTextView.setText(finalResult);
    }
}