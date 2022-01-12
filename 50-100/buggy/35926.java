@java.lang.Override
protected void onPostExecute(java.io.File file) {
    super.onPostExecute(file);
    if ((progressDialog) != null)
        progressDialog.dismiss();
    
    if (file != null) {
        mPictureTakenListener.onPictureTaken(file.getAbsolutePath());
        readyToTakePicture = true;
    }else {
        android.widget.Toast.makeText(context, getString(R.string.camera_error), Toast.LENGTH_SHORT).show();
        readyToTakePicture = true;
        mCamera.startPreview();
    }
}