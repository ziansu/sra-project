public void checkChangeDir() {
    long curr = java.lang.System.currentTimeMillis();
    if ((changeDirStart) >= 0) {
        if (curr >= ((changeDirStart) + (changeDirTime))) {
            changeDirStart = -1;
        }
    }
}