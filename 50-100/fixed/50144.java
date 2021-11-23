public void swipe(final com.yuyakaido.android.cardstackview.SwipeDirection direction, android.animation.AnimatorSet set) {
    executePreSwipeTask();
    performSwipe(direction, set, new android.animation.AnimatorListenerAdapter() {
        @java.lang.Override
        public void onAnimationEnd(android.animation.Animator animator) {
            executePostSwipeTask(new android.graphics.Point(0, (-2000)), direction);
        }
    });
}