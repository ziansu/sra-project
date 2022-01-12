private void UpdateAnimation(float elapsedTime) {
    if ((timeSinceLastFrame) >= (getSecondsInFrame())) {
        (currentFrame)++;
        currentFrame = (currentFrame) % (totalFrames);
        timeSinceLastFrame = 0;
    }
    timeSinceLastFrame += elapsedTime;
}