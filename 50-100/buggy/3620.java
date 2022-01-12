public void enableBullet(boolean isValid) {
    int start = getSelectionStart();
    int end = getSelectionEnd();
    if (start < end)
        setSelectionTextBullet(isValid, start, end);
    
    if (isValid) {
        setBullet();
    }
    state.enableBullet(isValid);
}