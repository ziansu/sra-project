private boolean needChooseBOS(int from, int until, int d) {
    int sz = until - from;
    if ((((1.5 * d) * (units.LogD.log[(d + 1)])) < sz) && (sz < (((600 * 1.5) * d) * ((units.LogD.log[(d + 1)]) - 1.37)))) {
        return true;
    }
    return false;
}