public java.lang.Double sum() {
    if (acc.isEmpty()) {
        return null;
    }
    return com.pwnetics.helper.ItemDoubleAccumulator.sum(acc.values());
}