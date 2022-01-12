private void commitReset() {
    commitTyped();
    charReset();
    if ((mCapsMode) == (org.nyanya.android.traditionalt9.TraditionalT9.CAPS_SINGLE)) {
        mCapsMode = org.nyanya.android.traditionalt9.TraditionalT9.CAPS_OFF;
    }
    updateShiftKeyState(getCurrentInputEditorInfo());
}