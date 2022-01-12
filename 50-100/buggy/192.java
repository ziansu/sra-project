public android.net.Uri onResult(android.app.Activity activity, int requestCode, android.content.Intent data) {
    switch (requestCode) {
        case com.smartdraw.jason.images.CameraAndGallery.CAMERA_REQUEST_CODE :
            android.media.MediaScannerConnection.scanFile(activity.getBaseContext(), imageString, null, null);
            startCrop(activity, imageUri);
            break;
        case com.smartdraw.jason.images.CameraAndGallery.GALLERY_REQUEST_CODE :
            return data.getData();
        case com.smartdraw.jason.images.CameraAndGallery.PHOTO_CROP_REQUEST_CODE :
            android.media.MediaScannerConnection.scanFile(activity.getBaseContext(), imageString, null, null);
            return imageCropUri;
        default :
            break;
    }
    return null;
}