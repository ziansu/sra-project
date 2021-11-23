@java.lang.Override
public boolean onAnimationEnd(android.view.View view) {
    if ((mSearchViewListener) != null) {
        mSearchViewListener.onSearchViewClosed();
    }
    setVisibility(com.radiationpressure.mickhardins.mtgrecall.searchview.GONE);
    return false;
}