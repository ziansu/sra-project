@java.lang.Override
public void onActivityResult(android.app.Activity activity, final int requestCode, final int resultCode, final android.content.Intent data) {
    if (requestCode == (com.reactnative.ivpusic.imagepicker.PickerModule.REQUEST_CODE_IMAGE)) {
        imagePickerResult(activity, requestCode, resultCode, data);
    }else
        if (requestCode == (com.reactnative.ivpusic.imagepicker.PickerModule.CAMERA_PICKER_REQUEST)) {
            cameraPickerResult(activity, requestCode, resultCode, data);
        }
    
}