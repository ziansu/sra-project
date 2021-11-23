@java.lang.Override
public void onReceive(com.github.endercrypt.ytddb.net.NETP_RemoveID object) {
    com.github.endercrypt.ytddb.backend.DataCenter.remove(object.videoID);
}