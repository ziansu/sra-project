@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btGallerySingleImage :
            pickImageSingle();
            break;
        case R.id.btGalleryMultipleImages :
            pickImageMultiple();
            break;
        case R.id.btCameraImage :
            takePicture();
            break;
        case R.id.btCameraImageCrop :
            takePictureAndCrop();
            break;
        case R.id.btGallerySingleImageCrop :
            pickImageSingleAndCrop();
            break;
    }
}