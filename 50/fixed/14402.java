@java.lang.Override
public java.util.List<java.lang.Long> getCounts() {
    if ((counts) != null) {
        return counts;
    }
    getTop();
    return counts;
}