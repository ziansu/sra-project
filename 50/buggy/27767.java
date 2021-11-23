public void stopButtonAnimation() {
    android.view.animation.Animation anim = getAnimation();
    if (anim != null)
        clearAnimation();
    
}