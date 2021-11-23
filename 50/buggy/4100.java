@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    floatingSearchView.setTranslationY(verticalOffset);
    mMediaRouteButton.setTranslationY(verticalOffset);
}