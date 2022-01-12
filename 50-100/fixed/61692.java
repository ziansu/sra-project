private void onScrollEnd() {
    if (mOverScrollable) {
        @com.otaliastudios.zoom.ZoomEngine.ScaledPan
        float fixX = ensureTranslationBounds(0, true, false);
        @com.otaliastudios.zoom.ZoomEngine.ScaledPan
        float fixY = ensureTranslationBounds(0, false, false);
        if ((fixX != 0) || (fixY != 0)) {
            animateTo(getZoom(), fixX, fixY, true, false);
            return ;
        }
    }
    setState(com.otaliastudios.zoom.ZoomEngine.NONE);
}