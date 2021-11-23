public static java.util.ArrayList<com.mediaplayer.strings.beans.Track> populateTrackInfoList(android.content.Context context) {
    android.database.Cursor[] cursors = com.mediaplayer.strings.utilities.MediaLibraryManager.getAllTracksFromProvider(context);
    com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList = com.mediaplayer.strings.utilities.MediaLibraryManager.createTrackListFromCursor(cursors);
    if ((com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList) != null) {
        com.mediaplayer.strings.utilities.MediaLibraryManager.tracklistSize = com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList.size();
        com.mediaplayer.strings.utilities.MediaLibraryManager.sortTracklist(MediaPlayerConstants.TAG_PLAYLIST_LIBRARY);
    }else {
        com.mediaplayer.strings.utilities.MediaLibraryManager.tracklistSize = 0;
    }
    return com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList;
}