private boolean executeSW_BREAK() {
    if (!(checkEOL()))
        return false;
    
    if ((mSwitch) != null) {
        ExecutingLineIndex = mSwitch.mEnd;
        mSwitch.mIsActive = false;
    }
    return true;
}