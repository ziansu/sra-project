void uploadAttach(android.net.Uri uri) {
    int size = com.xfrocks.api.androiddemo.App.getFeatureAttachmentResize();
    if (size > 0) {
        attemptResize(uri, size);
    }else {
        uploadAttach(uri.getPath(), null);
    }
}