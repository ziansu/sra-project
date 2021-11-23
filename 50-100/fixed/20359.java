public void nextFrame() {
    if ((currentDelay) == 0)
        currentFrame = ((currentFrame) + 1) % (frames.length);
    
    if ((baseFrame) == (-1))
        currentDelay = ((currentDelay) + 1) % (delay);
    else
        currentDelay = ((currentDelay) + 1) % ((currentFrame) == (baseFrame) ? baseDelay : delay);
    
}