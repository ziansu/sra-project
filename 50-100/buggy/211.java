private void reloadKeyboards() {
    mKeyboardSwitcher.setLanguageSwitcher(mLanguageSwitcher);
    if (((mKeyboardSwitcher.getInputView()) != null) && ((mKeyboardSwitcher.getKeyboardMode()) != (KeyboardSwitcher.MODE_NONE))) {
        mKeyboardSwitcher.setVoiceMode(((mEnableVoice) && (mEnableVoiceButton)), mVoiceOnPrimary);
    }
    updateKeyboardOptions();
    mKeyboardSwitcher.makeKeyboards(true);
}