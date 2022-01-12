public static java.util.ArrayList<com.mediaplayer.strings.beans.Track> populateTrackInfoList(android.content.Context context) {
    android.database.Cursor[] cursors = com.mediaplayer.strings.utilities.MediaLibraryManager.getAllTracksFromProvider(context);
    com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList = com.mediaplayer.strings.utilities.MediaLibraryManager.createTrackListFromCursor(cursors);
    com.mediaplayer.strings.utilities.MediaLibraryManager.tracklistSize = (((com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList) != null) && (!(com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList.isEmpty()))) ? com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList.size() : 0;
    com.mediaplayer.strings.utilities.MediaLibraryManager.sortTracklist(MediaPlayerConstants.TAG_PLAYLIST_LIBRARY);
    return com.mediaplayer.strings.utilities.MediaLibraryManager.trackInfoList;
}