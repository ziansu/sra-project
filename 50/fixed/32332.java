@java.lang.Override
public boolean isPlaying() {
    if (((musicSrv) != null) && (musicBound))
        return musicSrv.isPlaying();
    
    return false;
}