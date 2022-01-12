public void setLockScreenEnabled(boolean enabled) {
    if ((showLockScreen) == enabled) {
        return ;
    }
    showLockScreen = enabled;
    if ((!enabled) && ((mediaSession) != null)) {
        mediaSession.setActive(false);
    }
}