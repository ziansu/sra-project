@java.lang.Override
public void onClick(android.view.View v) {
    com.theartofdev.edmodo.cropper.CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).setAspectRatio(1, 1).start(this);
}