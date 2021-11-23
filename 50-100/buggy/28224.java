@java.lang.Override
public void onScroll(int totalY, int dy) {
    pullRefreshTotalDetalY = totalY;
    if (totalY == 0) {
        stickyView.setTranslationY(getOriginOffset());
        stickyView.setClickable(true);
    }else {
        float translationY = stickyView.getTranslationY();
        stickyView.setTranslationY((translationY + dy));
        stickyView.setClickable(false);
    }
}