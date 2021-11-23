@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(context, "Will open gallery", Toast.LENGTH_LONG).show();
    com.theartofdev.edmodo.cropper.CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).setAspectRatio(1, 1).start(this);
}