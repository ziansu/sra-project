public void onAccept(android.view.View v) {
    android.util.Log.i(edu.cs430x.fuschia.geosnap.activity.PictureReviewActivity.TAG, "Started upload to imgur");
    new edu.cs430x.fuschia.geosnap.network.imgur.services.UploadService(createUpload(), this).execute();
    android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
}