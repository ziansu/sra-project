@java.lang.Override
public void onUploadProgress(org.wordpress.android.fluxc.model.MediaModel media, float progress) {
    java.lang.String localMediaId = java.lang.String.valueOf(media.getId());
    mEditorMediaUploadListener.onMediaUploadProgress(localMediaId, progress);
}