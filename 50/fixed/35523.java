@java.lang.Override
protected void onStart() {
    super.onStart();
    if (((ui) != null) && (openKeyboardOnStart)) {
        ui.onStart();
    }
}