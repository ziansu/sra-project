public void toggleSymbols() {
    mIsSymbols = !(mIsSymbols);
    if (mIsSymbols)
        mCurrentSymbolsKeyboard = net.toload.main.hd.LIMEKeyboardSwitcher.SYMBOLS_KEYBOARD_1;
    
    if (mIsChinese)
        this.setKeyboardMode(imtype, 0, mImeOptions, true, mIsSymbols, false);
    else
        this.setKeyboardMode(imtype, mMode, mImeOptions, false, mIsSymbols, false);
    
}