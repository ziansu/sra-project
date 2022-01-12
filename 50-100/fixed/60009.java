@java.lang.Override
public void onScroll(android.view.View topChild, boolean isFirst) {
    if ((((refreshHeaderView) != null) && (topChild != null)) && (refreshing)) {
        refreshHeaderView.setTranslationY((isFirst ? (topChild.getY()) - (refreshHeaderHeight) : -(refreshHeaderHeight)));
    }
}