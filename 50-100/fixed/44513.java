public static void hideBgView(final android.widget.ImageView blurryView) {
    android.view.animation.Animation anim = si.jankokalj.simpleflickrbrowser.util.AnimHelper.createLinearInterpolatorAlpha(1.0F, 0.3F);
    anim.setDuration(175);
    anim.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
        @java.lang.Override
        public void onAnimationStart(android.view.animation.Animation animation) {
        }

        @java.lang.Override
        public void onAnimationEnd(android.view.animation.Animation animation) {
            blurryView.setVisibility(View.INVISIBLE);
        }

        @java.lang.Override
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }
    });
    blurryView.setVisibility(View.INVISIBLE);
    blurryView.setAnimation(anim);
    blurryView.animate();
}