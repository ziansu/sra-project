@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (cat.xlagunas.andrtc.view.fragment.ImagePickerFragment.REQUEST_IMAGE_CAPTURE)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        android.util.Log.d(cat.xlagunas.andrtc.view.fragment.ImagePickerFragment.TAG, "Image successfully obtained");
        presenter.onPictureTaken();
    }else
        if ((requestCode == (cat.xlagunas.andrtc.view.fragment.ImagePickerFragment.REQUEST_LOAD_GALLERY_IMAGE)) && (resultCode == (android.app.Activity.RESULT_OK))) {
            android.util.Log.d(cat.xlagunas.andrtc.view.fragment.ImagePickerFragment.TAG, "Image successfully obtained");
            presenter.onPictureSelectedFromGallery(data.getData());
        }
    
}