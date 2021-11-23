protected boolean close() {
    if (beforeClose()) {
        setState(com.magnetstreet.swt.extra.window.Window.STATE.CLOSED);
        if (!(getShell().isDisposed()))
            getShell().close();
        else
            logger.warning("Shell already disposed! This is not necessary of the beforeClose() function.");
        
        com.magnetstreet.swt.extra.window.Window.liveWindows.remove(this);
        return true;
    }
    return false;
}