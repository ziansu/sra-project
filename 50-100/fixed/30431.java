public void dispose() {
    keyboards.clear();
    keyboards = null;
    if ((logoutTimer) != null)
        logoutTimer.stop();
    
    logoutTimer = null;
    if (isVirtualKeyboard()) {
        if ((focusManager) != null)
            focusManager.stop();
        
        focusManager = null;
    }
    if ((frame) != null)
        frame.detach();
    
    frame = null;
}