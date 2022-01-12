@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent captureImage = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    android.net.Uri uri = android.net.Uri.fromFile(mPhotoFile);
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, com.example.suren.criminalintent.CrimeFragment.REQUEST_PHOTO);
}