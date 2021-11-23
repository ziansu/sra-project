private void reloadKeyboards() {
    mKeyboardSwitcher.setLanguageSwitcher(mLanguageSwitcher);
    if (((mKeyboardSwitcher.getInputView()) != null) && ((mKeyboardSwitcher.getKeyboardMode()) != (KeyboardSwitcher.MODE_NONE))) {
        mKeyboardSwitcher.setVoiceMode(((mEnableVoice) && (mEnableVoiceButton)), mVoiceOnPrimary, null);
    }
    updateKeyboardOptions();
    mKeyboardSwitcher.makeKeyboards(true);
}