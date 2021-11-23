@java.lang.Override
public void onImageFileGenerated(android.net.Uri file) {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((takePictureIntent.resolveActivity(getActivity().getPackageManager())) != null) {
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, file);
        startActivityForResult(takePictureIntent, cat.xlagunas.andrtc.view.fragment.ImagePickerFragment.REQUEST_IMAGE_CAPTURE);
    }
}