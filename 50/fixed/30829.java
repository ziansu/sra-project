public boolean canChangeDir() {
    long curr = java.lang.System.currentTimeMillis();
    if ((changeDirStart) == (-1)) {
        changeDirStart = curr;
        return true;
    }else {
        return false;
    }
}