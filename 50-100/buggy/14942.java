@java.lang.Override
public void onCardboardTrigger() {
    android.util.Log.i(com.google.vrtoolkit.cardboard.samples.treasurehunt.MainActivity.TAG, "onCardboardTrigger");
    if (isLookingAtObject()) {
        (score)++;
        overlayView.show3DToast(("Found it! Look around for another one.\nScore = " + (score)));
        hideObject();
    }else {
        overlayView.show3DToast("Look around to find the object!");
    }
    vibrator.vibrate(50);
}