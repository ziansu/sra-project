public java.lang.String getValue(long val) {
    if ((this.valuePrefix) != null) {
        return java.lang.String.format("%d.%d", this.valuePrefix, val);
    }
    return java.lang.String.format("%d", val);
}