public void animateBottomUp() {
    java.lang.System.out.println(com.byteshaft.streamsound.utils.AppGlobals.getControlsVisibility());
    if (!(com.byteshaft.streamsound.utils.AppGlobals.getControlsVisibility())) {
        android.view.animation.Animation bottomUp = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.bottom_up);
        controls_layout.startAnimation(bottomUp);
        controls_layout.setVisibility(View.VISIBLE);
        com.byteshaft.streamsound.utils.AppGlobals.setControlsVisible(true);
    }
}