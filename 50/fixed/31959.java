public void nextSpriteFrame() {
    if ((intCurrentFrame) < ((intFrames[intState]) - 1)) {
        (intCurrentFrame)++;
    }else {
        intCurrentFrame = 0;
    }
}