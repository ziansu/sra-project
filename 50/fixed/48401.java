public void attachPreDrawListener() {
    getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            getViewTreeObserver().removeOnPreDrawListener(this);
            setVisibility(View.GONE);
            setupAnimator();
            return true;
        }
    });
}