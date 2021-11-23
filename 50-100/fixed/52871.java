public void continueForm(android.view.View v) {
    PTakenActivity.photoData = dataToPass;
    PTakenActivity.thePic = bitmap;
    PTakenActivity.timetaken = theTime;
    PTakenActivity.filename = theTime.toString();
    releaseCamera();
    android.content.Intent i = new android.content.Intent(this, com.example.mmalo.prototype2.PTakenActivity.class);
    this.startActivity(i);
}