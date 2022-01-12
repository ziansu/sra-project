public void turnOffSphinx() {
    if (loadedSphinx) {
        loadedSphinx = false;
        makeToast("Turning off speech");
        unbindService(myPocketSphinxServiceConnection);
        sphinxIsBound = false;
        android.graphics.drawable.Drawable mDrawable = android.support.v4.content.res.ResourcesCompat.getDrawable(getResources(), R.drawable.microphone, null);
        mDrawable.setColorFilter(null);
        mDrawable.invalidateSelf();
        int resID = getResources().getIdentifier("error", "raw", getPackageName());
        playSphinxSFX(resID);
    }
}