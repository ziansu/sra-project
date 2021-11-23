public void setSporadicMode(float f) {
    if (f >= 1) {
        setNormalMode();
        return ;
    }
    if (f <= 0) {
        stop();
        return ;
    }
    playbackFrequency = f;
    playbackSporadic = true;
}