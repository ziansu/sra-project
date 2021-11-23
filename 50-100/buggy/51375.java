@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mCroppedImage = decodeFile(mCropImagePath);
    mCropImageView = ((com.comp.iitb.vialogue.library.cropper.CropImageView) (view.findViewById(R.id.cropImageView)));
    mCropImageView.setOnSetImageUriCompleteListener(this);
    mCropImageView.setOnCropImageCompleteListener(this);
    mCropImageView.setImageUriAsync(mStorage.getImageUri(mCroppedImage));
}