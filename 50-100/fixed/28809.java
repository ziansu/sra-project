@java.lang.Override
public void onSaveInstanceState(@android.support.annotation.NonNull
android.os.Bundle outState) {
    if (isViewPagerActive()) {
        outState.putBoolean(Constants.IS_LOCKED, viewPager.isLocked());
    }
    outState.putBoolean(Constants.ZOOM, ((photoViewAttacher) != null));
    super.onSaveInstanceState(outState);
}