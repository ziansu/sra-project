public BigNumber remain10(int m) {
    java.lang.StringBuilder strbuild = new java.lang.StringBuilder(number);
    try {
        strbuild = new java.lang.StringBuilder(strbuild.substring(((number.length()) - m), number.length()));
        return new BigNumber(strbuild.toString());
    } catch (java.lang.Exception e) {
        return new BigNumber(number);
    }
}