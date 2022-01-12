@java.lang.Override
public void update() {
    int currentFrame = ((counter)++) / (ANIMATION_SPEED);
    if (currentFrame >= (totalFrames)) {
        resetCounter();
    }
    java.lang.String filePath = "src/assets/animations/" + (animationName);
    filePath += currentFrame + ".png";
    this.imageIcon = new javax.swing.ImageIcon(filePath);
    done = isHit();
}