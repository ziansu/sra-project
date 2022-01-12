@java.lang.Override
public void onSaveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    if (isViewPagerActive()) {
        outState.putBoolean(Constants.IS_LOCKED, viewPager.isLocked());
    }
    if (isBackgroundImageActive()) {
        outState.putParcelable(Constants.IMAGE, ((android.graphics.drawable.BitmapDrawable) (backgroundImage.getDrawable())).getBitmap());
    }
    outState.putBoolean(Constants.ZOOM, ((photoViewAttacher) != null));
    super.onSaveInstanceState(outState);
}