public void nextFrame() {
    if ((currentDelay) == 0)
        currentFrame = ((currentFrame) + 1) % (frames.length);
    
    currentDelay = ((currentDelay) + 1) % ((currentFrame) == (baseFrame) ? baseDelay : delay);
}