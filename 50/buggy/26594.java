public final boolean tryToEnterLock() {
    if (mIsBusy) {
        return false;
    }
    mIsBusy = true;
    return true;
}