@java.lang.Override
public void onResume(boolean multitasking) {
    super.onResume(multitasking);
    if ((mPlusOneButton) != null) {
        mPlusOneButton.initialize(URL, null);
    }
}