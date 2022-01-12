@java.lang.Override
public void onPINSetup(java.lang.String pin) {
    com.doodeec.lockscreen.LockScreenController.setPIN(pin);
    runnable.run();
}