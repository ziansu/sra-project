@java.lang.Override
public void run() {
    startAnimation(fadeOutAnimation);
    getAnimation().setAnimationListener(new android.view.animation.Animation.AnimationListener() {
        @java.lang.Override
        public void onAnimationStart(android.view.animation.Animation animation) {
        }

        @java.lang.Override
        public void onAnimationEnd(android.view.animation.Animation animation) {
            if (isShown) {
                position = ((position) == ((texts.length) - 1)) ? 0 : (position) + 1;
                startAnimation();
            }
        }

        @java.lang.Override
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }
    });
}