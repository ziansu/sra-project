private org.wordpress.android.editor.legacy.WPEditImageSpan createWPEditImageSpanRemote(android.content.Context context, org.wordpress.android.util.helpers.MediaFile mediaFile) {
    if (((context == null) || (mediaFile == null)) || ((mediaFile.getFileURL()) == null)) {
        return null;
    }
    int drawable = (mediaFile.isVideo()) ? R.drawable.media_movieclip : R.drawable.legacy_dashicon_format_image_big_grey;
    android.net.Uri uri = android.net.Uri.parse(mediaFile.getFileURL());
    org.wordpress.android.editor.legacy.WPEditImageSpan imageSpan = new org.wordpress.android.editor.legacy.WPEditImageSpan(context, drawable, uri);
    imageSpan.setMediaFile(mediaFile);
    return imageSpan;
}