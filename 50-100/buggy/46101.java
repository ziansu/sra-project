public void setCurrentAnimationName(java.lang.String animationName) {
    if (this.animationName.equals(animationName)) {
        return ;
    }
    java.lang.String oldAnimationName = this.animationName;
    this.animationName = animationName;
    this.currentAnimation = this.getAnimationByName(animationName);
    this.elapsed = 0;
    this.onAnimationStateChanged(oldAnimationName, animationName);
}