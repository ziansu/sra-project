public java.awt.Image getCurrentAnimationImage() {
    try {
        return currentAnimation.getCurrentSceneImage();
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println(this.currentAnimationType);
        return null;
    }
}