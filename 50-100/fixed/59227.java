@java.lang.Override
public void onBackPressed() {
    long actualMiliSecs = java.lang.System.currentTimeMillis();
    if ((actualMiliSecs - (timeLastBackButtonPressed)) <= 2000) {
        if ((com.example.rezeck.photoservice.MainActivity.pt) != null) {
            com.example.rezeck.photoservice.MainActivity.pt.isrunning = false;
            com.example.rezeck.photoservice.MainActivity.pt.cancel(true);
        }
        this.finish();
        java.lang.System.exit(0);
    }else {
        timeLastBackButtonPressed = java.lang.System.currentTimeMillis();
        genericToast.setText(((java.lang.String) (getText(R.string.press_back_again_to_close))));
        genericToast.show();
    }
    return ;
}