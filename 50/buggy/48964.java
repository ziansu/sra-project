@java.lang.Override
public void onPINSetup(java.lang.String pin) {
    android.util.Log.w("PIN", pin);
    com.doodeec.lockscreen.LockScreenController.setPIN(pin);
    runnable.run();
}