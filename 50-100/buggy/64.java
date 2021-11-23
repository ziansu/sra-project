@java.lang.Override
public int getSupportedOperations() {
    int operation = ((((SUPPORT_DELETE) | (SUPPORT_PLAY)) | (SUPPORT_INFO)) | (SUPPORT_TRIM)) | (SUPPORT_MUTE);
    if (android.drm.DrmHelper.isDrmFile(getFilePath())) {
        operation |= SUPPORT_DRM_INFO;
        if (android.drm.DrmHelper.isShareableDrmFile(getFilePath())) {
            operation |= SUPPORT_SHARE;
        }
    }
    return operation;
}