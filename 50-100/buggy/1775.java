public void checkKeyFrames() {
    if ((curFrame) == null) {
        java.lang.System.out.println("Setting key frame. curFrame is null");
        setKeyFrame(playing.getKeyFrame(stateTime));
    }else
        if ((playing.getKeyFrame(stateTime)) != (curFrame)) {
            java.lang.System.out.println("Key frame is diff than curFrame");
            setKeyFrame(playing.getKeyFrame(stateTime));
        }
    
}