@java.lang.Override
public void run() {
    updateLabelLater(digLabel, "loading...");
    try {
        musicHandler.findNewSongs(path);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    javafx.collections.ObservableList<fun.personalUse.dataModel.FileBean> songArray = musicHandler.getMainPlaylist().getSongsInPlaylist();
    updateLabelLater(digLabel, ("complete: " + (songArray.size())));
    musicHandler.exportPlaylistsToXML();
}