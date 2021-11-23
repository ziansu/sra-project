public BigNumber remain10(int m) {
    java.lang.StringBuilder strbuild = new java.lang.StringBuilder(number);
    try {
        strbuild = new java.lang.StringBuilder(strbuild.substring(0, m));
        return new BigNumber(strbuild.reverse().toString());
    } catch (java.lang.Exception e) {
        return new BigNumber(number);
    }
}