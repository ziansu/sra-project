@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((i.resolveActivity(getActivity().getPackageManager())) != null) {
        java.io.File photofile = createFile();
        if (photofile != null) {
            mCrime.setImageLocation(photofile);
            i.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(photofile));
        }
        startActivityForResult(i, com.example.qiao.crimeaction.CrimeFragment.REQUEST_PHOTO);
    }
}