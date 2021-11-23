public void setFn(boolean useFn) {
    if ((mInputView) == null)
        return ;
    
    int oldShiftState = mInputView.getShiftState();
    if (useFn) {
        org.distantshoresmedia.keyboard.TKKeyboard kbd = getKeyboard(mSymbolsId, null);
        kbd.enableShiftLock();
        mCurrentId = mSymbolsId;
        mInputView.setKeyboard(kbd);
        mInputView.setShiftState(oldShiftState);
    }else {
        setKeyboardMode(mMode, mImeOptions, mHasVoice, false, null);
        mInputView.setShiftState(oldShiftState);
    }
}