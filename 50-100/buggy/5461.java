private void fadeOutInfo() {
    if ((mInfo.getVisibility()) == (android.view.View.VISIBLE))
        mInfo.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
    
    mInfo.setVisibility(View.INVISIBLE);
    if ((mPresentation) == null) {
        if ((mVerticalBar.getVisibility()) == (android.view.View.VISIBLE))
            mVerticalBar.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        
        mVerticalBar.setVisibility(View.INVISIBLE);
    }
}