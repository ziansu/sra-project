public void startAnimation(java.util.concurrent.ConcurrentLinkedQueue<Game.View.Animation.AnimationInfo> animators) {
    Game.View.Animation.AnimationInfo aniInfo;
    while ((aniInfo = animators.poll()) != null) {
        toAnimate.add(aniInfo);
    } 
    if ((toAnimate.size()) > 0) {
        animationTimer.start();
    }
}