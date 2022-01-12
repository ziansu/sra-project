private void nextKeyboard(android.view.inputmethod.EditorInfo currentEditorInfo, com.anysoftkeyboard.keyboards.KeyboardSwitcher.NextKeyboardType type) {
    com.anysoftkeyboard.utils.Log.d(com.anysoftkeyboard.AnySoftKeyboard.TAG, ((("nextKeyboard: currentEditorInfo.inputType=" + (currentEditorInfo.inputType)) + " type:") + type));
    com.anysoftkeyboard.keyboards.AnyKeyboard keyboard = mKeyboardSwitcher.nextKeyboard(currentEditorInfo, type);
    if (!(keyboard instanceof com.anysoftkeyboard.keyboards.GenericKeyboard)) {
        mSentenceSeparators = keyboard.getSentenceSeparators();
    }
    setKeyboardFinalStuff(currentEditorInfo, type);
}