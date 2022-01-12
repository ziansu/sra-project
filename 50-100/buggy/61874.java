private void setKeyboardFinalStuff(android.view.inputmethod.EditorInfo currentEditorInfo, com.anysoftkeyboard.keyboards.KeyboardSwitcher.NextKeyboardType type) {
    mShiftKeyState.reset();
    mControlKeyState.reset();
    updateShiftKeyState(currentEditorInfo);
    setDictionariesForCurrentKeyboard();
    if ((mKeyboardChangeNotificationType.equals(com.anysoftkeyboard.AnySoftKeyboard.KEYBOARD_NOTIFICATION_ALWAYS)) || ((mKeyboardChangeNotificationType.equals(com.anysoftkeyboard.AnySoftKeyboard.KEYBOARD_NOTIFICATION_ON_PHYSICAL)) && (type == (com.anysoftkeyboard.keyboards.KeyboardSwitcher.NextKeyboardType.AlphabetSupportsPhysical)))) {
        notifyKeyboardChangeIfNeeded();
    }
    postUpdateSuggestions();
}