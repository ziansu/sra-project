public long getMin() {
    if ((this.count) == 0) {
        return org.mobicents.slee.runtime.usage.UsageParameter.NOT_INITIALIZED_VALUE;
    }
    return min;
}