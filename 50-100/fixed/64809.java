public static int compute(int position, int size, int outSize) {
    int retX;
    int s = size / 2;
    if (position < s) {
        retX = 0;
    }else {
        if (position > (outSize - s)) {
            retX = outSize - size;
        }else {
            retX = position - s;
        }
    }
    if (retX < 0) {
        retX = 0;
    }
    return retX;
}