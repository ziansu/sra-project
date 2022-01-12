public void startCropMainActivity(java.lang.String path) {
    stopRecording();
    android.content.Intent imageEditorIntent = new com.adobe.creativesdk.aviary.AdobeImageIntent.Builder(this).setData(mStorage.getUriFromPath(path)).build();
    startActivityForResult(imageEditorIntent, com.comp.iitb.vialogue.activity.AudioRecordActivity.REQ_CODE_CSDK_IMAGE_EDITOR);
}