protected void init() {
    checkLegal();
    calcMinMax(mLastStart, mLastEnd);
    calcYValueSum();
    calcYValueCount();
    calcXValAverageLength();
}