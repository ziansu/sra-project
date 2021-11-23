public void start(final com.dd.processbutton.ProcessButton button) {
    final android.os.Handler handler = new android.os.Handler();
    button.setProgress(1);
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mProgress += 10;
            button.setProgress(mProgress);
            if ((mProgress) < 100) {
                handler.postDelayed(this, generateDelay());
            }else {
                mListener.onComplete();
            }
        }
    }, generateDelay());
}