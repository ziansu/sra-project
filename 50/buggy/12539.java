@java.lang.Override
public void onActionCancel(com.example.didi.slidebutton.SlideButton button) {
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startShimmer();
        }
    }, 1000);
}