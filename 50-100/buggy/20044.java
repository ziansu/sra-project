@java.lang.Override
public void onClick(final android.view.View v) {
    mOkButton.setEnabled(false);
    switch (v.getId()) {
        case R.id.okay :
            mPhotoTakenListener.onPhotoConfirm();
            com.kalei.utils.PhotoLocationUtils.savePhoto(getContext(), mImageFilepath, mOriginalImagePath);
            getContext().startService(getPhotoUploadIntent());
            break;
        case R.id.cancel :
            mPhotoTakenListener.onPhotoCancel();
            deletePhoto(mImageFilepath);
            break;
    }
}