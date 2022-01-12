public void update() {
    int currentFrame = ((counter)++) / (animation.Animation.ANIMATION_SPEED);
    if (currentFrame >= (totalFrames)) {
        resetCounter();
        currentFrame = 0;
        done = (--(currentLoop)) < 1;
    }
    java.lang.String filePath = "src/assets/animations/" + (animationName);
    filePath += currentFrame + ".png";
    this.imageIcon = new javax.swing.ImageIcon(filePath);
}