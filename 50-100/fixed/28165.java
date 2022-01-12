private void showScroller() {
    scrollDownChat.setEnabled(true);
    scrollDownChat.setTag(getString(R.string.visible));
    scrollDownChat.startAnimation(slideIn);
    scrollDownChat.setVisibility(View.VISIBLE);
    slideIn.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
        @java.lang.Override
        public void onAnimationStart(android.view.animation.Animation animation) {
        }

        @java.lang.Override
        public void onAnimationEnd(android.view.animation.Animation animation) {
        }

        @java.lang.Override
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }
    });
}