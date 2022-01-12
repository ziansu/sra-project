protected java.io.File startCameraVideo() {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
    android.net.Uri toAdd = org.dvaletin.apps.nabludatel.ABSNabludatelActivity.getOutputMediaFileUri(Consts.MEDIA_TYPE_VIDEO);
    videoFileUri.add(toAdd);
    intent.putExtra(MediaStore.EXTRA_OUTPUT, toAdd);
    startActivityForResult(intent, Consts.CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE);
    return new java.io.File(videoFileUri.get(((videoFileUri.size()) - 1)).getPath());
}