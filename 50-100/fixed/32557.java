public java.util.List<ru.dsi.bgbilling.modules.inet.accounting.quota.Slice> getSlices() {
    java.util.List<ru.dsi.bgbilling.modules.inet.accounting.quota.Slice> result = new java.util.ArrayList<ru.dsi.bgbilling.modules.inet.accounting.quota.Slice>();
    ru.dsi.bgbilling.modules.inet.accounting.quota.Slice s;
    synchronized(this.sliceQueue) {
        for (java.lang.Object o : this.sliceQueue) {
            s = ((ru.dsi.bgbilling.modules.inet.accounting.quota.Slice) (o));
            result.add(s);
        }
    }
    return result;
}