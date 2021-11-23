public void nextSpriteFrame() {
    if ((intCurrentFrame) < (intFrames[intState])) {
        (intCurrentFrame)++;
    }else {
        intCurrentFrame = 0;
    }
}