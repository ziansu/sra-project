private void resolveToWaveData(java.util.ArrayList<java.lang.Short> list) {
    short allMax = 0;
    for (java.lang.Short sh : list) {
        if ((sh != null) && (sh > allMax)) {
            allMax = sh;
        }
    }
    int curScale = allMax / (mBaseLine);
    if (curScale > (mScale)) {
        mScale = (curScale == 0) ? 1 : curScale;
    }
}