protected boolean isValid(int step) {
    return ((repeatCnt) < 0) || ((step >= 0) && (step <= ((repeatCnt) << 1)));
}