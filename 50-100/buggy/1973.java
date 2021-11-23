private void hideDeckInformation(boolean fade) {
    setTitle(getResources().getString(R.string.app_name));
    mDeckInformation.setVisibility(View.INVISIBLE);
    if (fade) {
        mDeckInformation.setAnimation(com.ichi2.anim.ViewAnimation.fade(ViewAnimation.FADE_OUT, 500, 0));
    }
}