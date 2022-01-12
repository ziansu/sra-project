public static java.util.ArrayList<com.vishnu.exoplayerdemo.pojos.PlaylistItem> getDefaultPlaylistItems() {
    java.util.ArrayList<com.vishnu.exoplayerdemo.pojos.PlaylistItem> playlistItems = new java.util.ArrayList<>();
    java.io.File download = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    java.io.File videoFile = new java.io.File(download, "1.mp4");
    com.vishnu.exoplayerdemo.pojos.PlaylistItem videoItem = new com.vishnu.exoplayerdemo.pojos.PlaylistItem(videoFile.getAbsolutePath(), "VIDEO");
    com.vishnu.exoplayerdemo.pojos.PlaylistItem smartTemplate = new com.vishnu.exoplayerdemo.pojos.PlaylistItem("SMART_TEMPLATE.HTML", "SMART_TEMPLATE");
    smartTemplate.durationInMills = 30000;
    playlistItems.add(videoItem);
    playlistItems.add(smartTemplate);
    return playlistItems;
}