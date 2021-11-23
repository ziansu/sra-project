public void onResume() {
    super.onResume();
    if (!(hasCamera(myContext))) {
        android.widget.Toast toast = android.widget.Toast.makeText(myContext, "Sorry, your phone does not have a camera!", Toast.LENGTH_LONG);
        toast.show();
        finish();
    }
    if ((mCamera) == null) {
        if ((findFrontFacingCamera()) < 0) {
            android.widget.Toast.makeText(this, "No front facing camera found.", Toast.LENGTH_LONG).show();
        }
        openCamera(findBackFacingCamera());
        mPreview.refreshCamera(mCamera);
    }
}