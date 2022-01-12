public void animateBottomUp() {
    if (!(com.byteshaft.streamsound.utils.AppGlobals.getControlsVisibility())) {
        android.view.animation.Animation bottomUp = android.view.animation.AnimationUtils.loadAnimation(getActivity(), R.anim.bottom_up);
        controls_layout.startAnimation(bottomUp);
        controls_layout.setVisibility(View.VISIBLE);
        com.byteshaft.streamsound.utils.AppGlobals.setControlsVisible(true);
    }
}