@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    android.util.Log.i(course.labs.intentslab.ActivityLoaderActivity.TAG, "Entered onActivityResult()");
    if ((requestCode == (course.labs.intentslab.ActivityLoaderActivity.GET_TEXT_REQUEST_CODE)) && (resultCode == (RESULT_OK))) {
        mUserTextView = ((android.widget.TextView) (findViewById(R.id.textView1)));
        mUserTextView.setText(((java.lang.String) (data.getExtras().get(course.labs.intentslab.ExplicitlyLoadedActivity.class.getName()))));
    }
}