public void enableBold(boolean isValid) {
    if ((getSelectionStart()) < (getSelectionEnd()))
        setSelectionTextBold(isValid);
    
    state.enableBold(isValid);
}