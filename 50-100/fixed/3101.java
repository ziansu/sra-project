public void hideDelayed(long delay) {
    hideDelay = delay;
    if ((delay < 0) || (!(canViewHide))) {
        return ;
    }
    if (userInteracting) {
        return ;
    }
    visibilityHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            animateVisibility(false);
        }
    }, delay);
}