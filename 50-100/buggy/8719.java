public com.jsing.common.string.StringTrimmer getBeforeNext(java.lang.String stringToSearch) {
    if ((this.string) == null)
        return this;
    
    int index = getIndex(stringToSearch);
    if (index > (-1)) {
        this.end = java.lang.Math.max(this.start, index);
    }
    return this;
}