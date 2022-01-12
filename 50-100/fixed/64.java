@java.lang.Override
public int getSupportedOperations() {
    if (android.drm.DrmHelper.isDrmFile(getFilePath())) {
        int operation = (((SUPPORT_DELETE) | (SUPPORT_PLAY)) | (SUPPORT_INFO)) | (SUPPORT_DRM_INFO);
        if (android.drm.DrmHelper.isShareableDrmFile(getFilePath())) {
            operation |= SUPPORT_SHARE;
        }
        return operation;
    }
    return (((((SUPPORT_DELETE) | (SUPPORT_SHARE)) | (SUPPORT_PLAY)) | (SUPPORT_INFO)) | (SUPPORT_TRIM)) | (SUPPORT_MUTE);
}