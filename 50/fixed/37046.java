public int getRemainingLoopCount() {
    if ((loopLength) == (-1)) {
        return -1;
    }else {
        return java.lang.Math.max(((loopLength) - (loopCount)), 0);
    }
}