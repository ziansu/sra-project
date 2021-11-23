public void checkChangeDir() {
    long curr = java.lang.System.currentTimeMillis();
    if ((changeDirStart) > (-1)) {
        if (curr >= ((changeDirStart) + (changeDirTime))) {
            changeDirStart = -1;
        }
    }
}