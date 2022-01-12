private void hideScroller() {
    scrollDownChat.setTag(getString(R.string.notVisible));
    scrollDownChat.setEnabled(false);
    scrollDownChat.startAnimation(slideOut);
    slideOut.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
        @java.lang.Override
        public void onAnimationStart(android.view.animation.Animation animation) {
        }

        @java.lang.Override
        public void onAnimationEnd(android.view.animation.Animation animation) {
            scrollDownChat.setVisibility(View.GONE);
        }

        @java.lang.Override
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }
    });
}