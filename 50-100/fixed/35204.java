@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.i(course.labs.intentslab.ActivityLoaderActivity.TAG, "Entered onActivityResult()");
    if ((requestCode == (course.labs.intentslab.ActivityLoaderActivity.GET_TEXT_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        java.lang.String finalResult = data.getExtras().getString(course.labs.intentslab.ActivityLoaderActivity.TAG);
        mUserTextView.setText(finalResult);
    }
}