public boolean releaseTap() {
    boolean rtn = false;
    if ((selectedTap) instanceof org.tapchain.core.IRelease) {
        ((org.tapchain.core.IRelease) (selectedTap)).onRelease(this, touched);
        rtn = true;
    }
    if (hasLockReleaseTap())
        unlockReleaseTap();
    
    clearSelectedTap();
    commitRegistration();
    return rtn;
}