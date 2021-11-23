@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            restoreToInitial();
        }
    });
}