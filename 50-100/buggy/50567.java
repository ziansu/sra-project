private void scheduleStartPostponedTransition(final android.widget.ImageView sharedElement) {
    sharedElement.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            sharedElement.getViewTreeObserver().removeOnPreDrawListener(this);
            android.support.v4.app.ActivityCompat.startPostponedEnterTransition(getActivity());
            return true;
        }
    });
}