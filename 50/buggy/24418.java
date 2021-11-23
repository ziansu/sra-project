@java.lang.Override
public void onClick(android.view.View v) {
    mCropImageView.getCroppedImageAsync();
    ((com.comp.iitb.vialogue.activity.CropMainActivity) (getActivity())).done(currentBitmap);
}