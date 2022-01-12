public long getTotalAmount() {
    ru.dsi.bgbilling.modules.inet.accounting.quota.Slice slice;
    long now = java.lang.System.currentTimeMillis();
    long amount = 0;
    synchronized(this.sliceQueue) {
        for (java.lang.Object o : this.sliceQueue) {
            slice = ((ru.dsi.bgbilling.modules.inet.accounting.quota.Slice) (o));
            if ((slice.endTime) > (now - ((this.sliceCount) * (this.slicePeriod)))) {
                amount += slice.amount.get();
            }
        }
    }
    return amount;
}