public java.awt.Image getCurrentAnimationImage() {
    try {
        return currentAnimation.getCurrentSceneImage();
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}