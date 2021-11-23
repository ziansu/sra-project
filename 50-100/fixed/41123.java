public void startAnimation(java.util.HashSet<Game.View.Animation.AnimationInfo> animators) {
    for (Game.View.Animation.AnimationInfo animationInfo : animators) {
        toAnimate.add(animationInfo);
    }
    animators.clear();
    if ((toAnimate.size()) > 0) {
        animationTimer.start();
    }
}