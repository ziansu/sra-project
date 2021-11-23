public static com.nag.android.stm.ThumbnailAdapter getInstance(android.content.Context context, boolean side, android.graphics.Point size) {
    if ((com.nag.android.stm.ThumbnailAdapter.instance) == null) {
        com.nag.android.stm.ThumbnailAdapter.instance = new com.nag.android.stm.ThumbnailAdapter(context, side, size);
    }
    return com.nag.android.stm.ThumbnailAdapter.instance;
}