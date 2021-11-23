public void update(android.graphics.Canvas canvas) {
    if ((animationCount) < (singleAnimation.animationFrames.size()))
        (animationCount)++;
    else
        isFinished = true;
    
    drawSelf(canvas);
}