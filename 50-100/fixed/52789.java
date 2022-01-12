@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        switch (requestCode) {
            case Constant.SELECT_PHOTO :
                handleGalleryResult(data);
                break;
            case Constant.TAKE_PHOTO :
                handleCameraResult(cameraPictureUrl);
                break;
            case Constant.CROPING_CODE :
                com.kevadiyakrunalk.rxphotopicker.RxPhotoPicker.getInstance(getApplicationContext()).onImagePicked(cropPictureUrl);
                finish();
                break;
        }
    }else
        finish();
    
}