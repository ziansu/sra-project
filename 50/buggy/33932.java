@java.lang.Override
public int getCurrentPosition() {
    if ((((musicSrv) != null) && (musicBound)) && (musicSrv.isPlaying())) {
        return musicSrv.getSongPosition();
    }else
        return 0;
    
}