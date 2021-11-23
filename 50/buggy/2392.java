public void measureCurrentView(android.view.View currentView) {
    mCurrentView = currentView;
    this.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            requestLayout();
        }
    });
}