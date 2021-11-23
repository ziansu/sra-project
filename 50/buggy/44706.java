@java.lang.Override
public int getDuration() {
    if ((((musicSrv) != null) && (musicBound)) && (musicSrv.isPlaying()))
        return musicSrv.getDuration();
    else
        return 0;
    
}