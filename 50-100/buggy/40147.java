@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent result) {
    if ((requestCode == (com.soundcloud.android.crop.Crop.REQUEST_PICK)) && (resultCode == (RESULT_OK))) {
        beginCrop(result.getData());
    }else
        if (requestCode == (com.soundcloud.android.crop.Crop.REQUEST_CROP)) {
            handleCrop(resultCode, result);
        }
    
}