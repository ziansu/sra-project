@java.lang.Override
public int getCurrentPosition() {
    if ((((musicSrv) != null) && (musicBound)) && (isPlaying()))
        return musicSrv.getPosition();
    else
        return 0;
    
}