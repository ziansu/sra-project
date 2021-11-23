@java.lang.Override
public void mediaSessionMetadataChanged(org.chromium.content_public.common.MediaMetadata metadata) {
    mPageMetadata = metadata;
    if ((mPageMetadata) != null) {
        mMediaImageManager.downloadImage(mPageMetadata.getArtwork(), this);
    }
    updateNotificationMetadata();
}