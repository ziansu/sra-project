@java.lang.Override
public void run() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        public void run() {
            showPlay(btn);
        }
    }, 500);
}