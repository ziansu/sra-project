public void update(android.graphics.Canvas canvas) {
    if ((animationCount) < ((singleAnimation.animationFrames.size()) - 1))
        (animationCount)++;
    else
        isFinished = true;
    
    drawSelf(canvas);
}