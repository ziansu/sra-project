public void enableBullet(boolean isValid) {
    int start = getSelectionStart();
    int end = getSelectionEnd();
    if (end > start) {
        start = start ^ end;
        end = start ^ end;
        start = start ^ end;
    }
    if (start < end)
        setSelectionTextBullet(isValid, start, end);
    
    if (isValid) {
        setBullet();
    }
    state.enableBullet(isValid);
}