private java.lang.String shiftString(java.lang.String originalStr) {
    java.lang.StringBuilder shiftedStr = new java.lang.StringBuilder();
    int shiftDist = (originalStr.charAt(0)) - 'a';
    for (char ch : originalStr.toCharArray()) {
        int shiftedInteger = (((ch - 'a') - shiftDist) + 26) % 26;
        int shiftedCh = ((char) ('a' + shiftedInteger));
        shiftedStr.append(shiftedCh);
    }
    return shiftedStr.toString();
}