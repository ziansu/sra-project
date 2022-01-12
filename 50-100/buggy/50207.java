public static void loadImages(android.content.Context context) {
    java.util.List<com.ln.images.models.LocalMedia> mediasInternal = com.ln.images.models.ImagesManager.getImages(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    java.util.List<com.ln.images.models.LocalMedia> mediasExternal = com.ln.images.models.ImagesManager.getImages(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    if (mediasExternal != null) {
        com.ln.images.models.ImagesManager.mListImageExternal.addAll(mediasExternal);
        com.ln.images.models.ImagesManager.mListImageAll.addAll(mediasExternal);
    }
    if (mediasInternal != null) {
        com.ln.images.models.ImagesManager.mListImageInternal.addAll(mediasInternal);
        com.ln.images.models.ImagesManager.mListImageAll.addAll(mediasInternal);
    }
}