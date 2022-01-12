private org.chromium.content_public.common.MediaMetadata.MediaImage selectImage(java.util.List<org.chromium.content_public.common.MediaMetadata.MediaImage> images) {
    if (images == null)
        return null;
    
    org.chromium.content_public.common.MediaMetadata.MediaImage selectedImage = null;
    double bestScore = 0;
    for (org.chromium.content_public.common.MediaMetadata.MediaImage image : images) {
        double newScore = getImageScore(image);
        if (newScore > bestScore) {
            bestScore = newScore;
            selectedImage = image;
        }
    }
    return selectedImage;
}