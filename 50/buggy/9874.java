@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if ((getChildCount()) == 0) {
        createAircraft();
    }
}