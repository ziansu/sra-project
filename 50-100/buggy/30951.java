public BigNumber multiply10(int m) {
    java.lang.StringBuilder strbuild = new java.lang.StringBuilder(number);
    for (int i = 0; i < m; i++) {
        strbuild.insert(0, '0');
    }
    return new BigNumber(strbuild.toString());
}