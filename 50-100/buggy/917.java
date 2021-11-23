public void update() {
    done = false;
    int currentFrame = ((counter)++) / (animation.Animation.ANIMATION_SPEED);
    if (currentFrame >= (totalFrames)) {
        resetCounter();
        currentFrame = 0;
        if ((--(currentLoop)) < 1) {
            done = true;
            resetLoops();
        }
    }
    java.lang.String filePath = "src/assets/animations/" + (animationName);
    filePath += currentFrame + ".png";
    this.imageIcon = new javax.swing.ImageIcon(filePath);
}