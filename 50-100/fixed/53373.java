private void resolveToWaveData(java.util.ArrayList<java.lang.Short> list) {
    short allMax = 0;
    for (int i = 0; i < (list.size()); i++) {
        java.lang.Short sh = list.get(i);
        if ((sh != null) && (sh > allMax)) {
            allMax = sh;
        }
    }
    int curScale = allMax / (mBaseLine);
    if (curScale > (mScale)) {
        mScale = (curScale == 0) ? 1 : curScale;
    }
}