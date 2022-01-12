@java.lang.Override
public void onClick(final android.view.View v) {
    mOkButton.setEnabled(false);
    switch (v.getId()) {
        case R.id.okay :
            com.kalei.utils.PhotoLocationUtils.savePhoto(getContext(), mImageFilepath, mOriginalImagePath);
            getContext().startService(getPhotoUploadIntent());
            mPhotoTakenListener.onPhotoConfirm();
            break;
        case R.id.cancel :
            deletePhoto(mImageFilepath);
            mPhotoTakenListener.onPhotoCancel();
            break;
    }
}