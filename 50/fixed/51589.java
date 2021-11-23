@java.lang.Override
public void onClick(android.view.View v) {
    android.net.Uri uri = android.net.Uri.fromFile(photo[0]);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, ggr.tpl7.AthleteFragment.REQUEST_PHOTO);
}