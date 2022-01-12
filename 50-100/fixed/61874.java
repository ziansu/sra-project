private void setKeyboardFinalStuff(com.anysoftkeyboard.keyboards.KeyboardSwitcher.NextKeyboardType type) {
    mShiftKeyState.reset();
    mControlKeyState.reset();
    setDictionariesForCurrentKeyboard();
    if ((mKeyboardChangeNotificationType.equals(com.anysoftkeyboard.AnySoftKeyboard.KEYBOARD_NOTIFICATION_ALWAYS)) || ((mKeyboardChangeNotificationType.equals(com.anysoftkeyboard.AnySoftKeyboard.KEYBOARD_NOTIFICATION_ON_PHYSICAL)) && (type == (com.anysoftkeyboard.keyboards.KeyboardSwitcher.NextKeyboardType.AlphabetSupportsPhysical)))) {
        notifyKeyboardChangeIfNeeded();
    }
    postUpdateSuggestions();
}