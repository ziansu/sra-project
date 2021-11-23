@java.lang.Override
public boolean onAnimationEnd(android.view.View view) {
    if ((mSearchViewListener) != null) {
        mSearchViewListener.onSearchViewShown();
    }
    return false;
}