@java.lang.Override
public long getDuration() throws android.os.RemoteException {
    if (mediaPlayer.isPlaying())
        return mediaPlayer.getDuration();
    
    if (((playlist) != null) && ((playlist.size()) > 0))
        return playlist.indexOf(index);
    
    return -1;
}