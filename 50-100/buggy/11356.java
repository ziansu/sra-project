public static java.lang.String getCurrentTitle(boolean preparing) {
    return (br.com.carlosrafaelgn.fplay.playback.Player.thePlayer) == null ? "" : (br.com.carlosrafaelgn.fplay.playback.Player.localSong) == null ? br.com.carlosrafaelgn.fplay.playback.Player.thePlayer.getText(R.string.nothing_playing).toString() : !preparing ? br.com.carlosrafaelgn.fplay.playback.Player.localSong.title : ((br.com.carlosrafaelgn.fplay.playback.Player.thePlayer.getText(R.string.loading)) + " ") + (br.com.carlosrafaelgn.fplay.playback.Player.localSong.title);
}