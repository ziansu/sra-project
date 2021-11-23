public void toggleSymbols() {
    if (mIsChinese)
        this.setKeyboardMode(imtype, 0, mImeOptions, true, (!(mIsSymbols)), false);
    else
        this.setKeyboardMode(imtype, mMode, mImeOptions, false, (!(mIsSymbols)), false);
    
}