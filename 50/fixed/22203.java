protected void init() {
    checkLegal();
    calcMinMax(mLastStart, mLastEnd);
    calcYValueCount();
    calcXValAverageLength();
}