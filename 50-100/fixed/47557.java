private void setupSoftKeyboardListener() {
    android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {
        @java.lang.Override
        public void onGlobalLayout() {
            int currentViewportHeight = container.getHeight();
            if ((viewportHeight) == 0) {
                viewportHeight = currentViewportHeight;
            }
            if (currentViewportHeight < (viewportHeight)) {
                aitLogo.setVisibility(View.GONE);
            }else {
                aitLogo.setVisibility(View.VISIBLE);
            }
        }
    };
    container.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
}