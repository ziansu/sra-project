private void setupSoftKeyboardListener() {
    android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {
        private java.lang.String TAG = "onGlobalLayoutListener";

        @java.lang.Override
        public void onGlobalLayout() {
            int currentViewportHeight = container.getHeight();
            if (currentViewportHeight > (viewportHeight)) {
                aitLogo.setVisibility(View.VISIBLE);
            }else
                if (currentViewportHeight < (viewportHeight)) {
                    aitLogo.setVisibility(View.GONE);
                }else {
                    return ;
                }
            
            viewportHeight = currentViewportHeight;
        }
    };
    container.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
}