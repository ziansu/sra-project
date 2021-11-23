@java.lang.Override
public void onStartInputView(android.view.inputmethod.EditorInfo attribute, boolean restarting) {
    super.onStartInputView(attribute, restarting);
    setLatinKeyboard(mCurKeyboard);
    mInputView.closing();
    updateShiftKeyState(attribute);
    final android.view.inputmethod.InputMethodSubtype subtype = mInputMethodManager.getCurrentInputMethodSubtype();
    mInputView.setSubtypeOnSpaceKey(subtype);
}