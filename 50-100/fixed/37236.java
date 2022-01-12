private void animateToTrack() {
    android.view.animation.Animation in = animator.getInAnimation();
    android.view.animation.Animation out = animator.getOutAnimation();
    animator.setInAnimation(inFromLeftAnimation());
    animator.setOutAnimation(outToRightAnimation());
    animator.setDisplayedChild(viewMap.get(com.sloths.speedy.shortsounds.view.MainActivity.TRACKS));
    animator.setInAnimation(in);
    animator.setOutAnimation(out);
    currentView = com.sloths.speedy.shortsounds.view.MainActivity.TRACKS;
}