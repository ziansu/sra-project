public void setAnimation(net.rpgtoolkit.common.assets.Animation animation) {
    if ((this.animation) != null) {
        this.animation.removeAnimationChangeListener(this);
    }
    this.animation = animation;
    this.animation.addAnimationChangeListener(this);
    if (animation == null) {
        timer = null;
        frameImage = null;
        repaint();
    }else
        if ((animation.getFrameCount()) > 0) {
            frameImage = animation.getFrame(0).getFrameImage();
        }
    
}