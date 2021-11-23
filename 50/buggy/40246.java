public com.arover.moment.Moment minus(int n, int unit) {
    if (n > 0) {
        n = -n;
    }
    set((-n), unit);
    return mMoment;
}