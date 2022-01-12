@java.lang.Override
public void onUploadSuccess(org.wordpress.android.fluxc.model.MediaModel media) {
    if (((mEditorMediaUploadListener) != null) && ((media.getFileName()) != null)) {
        org.wordpress.android.fluxc.model.MediaModel pendingMedia = getPendingUploadWithName(media.getFileName());
        if (pendingMedia != null) {
            mEditorMediaUploadListener.onMediaUploadSucceeded(java.lang.String.valueOf(pendingMedia.getMediaId()), org.wordpress.android.util.WPStoreUtils.fromMediaModel(media));
            mPendingUploads.remove(pendingMedia);
        }
    }
}