@java.lang.Override
protected final int getSupportedReconfigMaskImpl() {
    return ((((((((((((minimumReconfigStateMask) | (STATE_MASK_AUTOPOSITION)) | (STATE_MASK_CHILDWIN)) | (STATE_MASK_UNDECORATED)) | (STATE_MASK_ALWAYSONTOP)) | (STATE_MASK_ALWAYSONBOTTOM)) | (STATE_MASK_STICKY)) | (STATE_MASK_RESIZABLE)) | (STATE_MASK_MAXIMIZED_VERT)) | (STATE_MASK_MAXIMIZED_HORZ)) | (STATE_MASK_FULLSCREEN)) | (STATE_MASK_POINTERVISIBLE)) | (STATE_MASK_POINTERCONFINED);
}