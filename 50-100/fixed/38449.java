@java.lang.Override
public void onBackPressed() {
    if (isBackKeyPressed) {
        warningToast.cancel();
        isNoMoreToast = true;
        super.onBackPressed();
    }
    isBackKeyPressed = true;
    if (!(isNoMoreToast))
        warningToast.show();
    
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            isBackKeyPressed = false;
        }
    }, 2000);
}