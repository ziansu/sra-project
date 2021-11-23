private void onScrollEnd() {
    if (mOverScrollable) {
        float fixX = ensureTranslationBounds(0, true, false);
        float fixY = ensureTranslationBounds(0, false, false);
        if ((fixX != 0) || (fixY != 0)) {
            animateTo(getZoom(), fixX, fixY, true, false);
            return ;
        }
    }
    setMode(com.otaliastudios.zoom.ZoomEngine.NONE);
}