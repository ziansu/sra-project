public void setRange(final java.lang.Long min, final java.lang.Long max, final java.lang.Long tickSize) {
    setMin(min);
    setMax(max);
    if (tickSize != null) {
        setTickSize(tickSize.toString());
    }
}