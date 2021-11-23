private void observeDrawCalls() {
    drawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            if (!(isMeDrawingNow)) {
                updateBlur();
            }
            return true;
        }
    };
    blurView.getViewTreeObserver().addOnPreDrawListener(drawListener);
}