@java.lang.Override
public void onClick(android.view.View v) {
    android.net.Uri uri = mPhotoFiles.get(photoIndex);
    java.lang.System.out.println(("uri.toString " + (uri.toString())));
    captureImage.putExtra(MediaStore.EXTRA_OUTPUT, uri);
    startActivityForResult(captureImage, com.bignerdranch.android.criminalintent.CrimeFragment.REQUEST_PHOTO);
}