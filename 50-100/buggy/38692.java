@java.lang.Override
public void onUploadSuccess(org.wordpress.android.fluxc.model.MediaModel media) {
    if (((mEditorMediaUploadListener) != null) && (media != null)) {
        mEditorMediaUploadListener.onMediaUploadSucceeded(java.lang.String.valueOf(media.getId()), org.wordpress.android.util.FluxCUtils.mediaFileFromMediaModel(media));
    }
    removeMediaFromPendingList(media);
}