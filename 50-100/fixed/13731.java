public BigNumber divide10(int m) {
    java.lang.StringBuilder strbuild = new java.lang.StringBuilder(number);
    try {
        return new BigNumber(strbuild.substring(0, ((number.length()) - m)).toString());
    } catch (java.lang.Exception e) {
        return new BigNumber("0");
    }
}