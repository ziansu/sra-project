public void checkKeyFrames() {
    if ((curFrame) == null) {
        setKeyFrame(playing.getKeyFrame(stateTime));
    }else
        if ((playing.getKeyFrame(stateTime)) != (curFrame)) {
            setKeyFrame(playing.getKeyFrame(stateTime));
        }
    
}