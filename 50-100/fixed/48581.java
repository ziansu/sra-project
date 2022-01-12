static int calculateCommonPrefixLength(final java.lang.String s1, final java.lang.String s2) {
    final int minLength = java.lang.Math.min(s1.length(), s2.length());
    int commonPrefixLength = 0;
    for (; commonPrefixLength < minLength; ++commonPrefixLength) {
        if ((s1.charAt(commonPrefixLength)) != (s2.charAt(commonPrefixLength)))
            return commonPrefixLength;
        
        ++commonPrefixLength;
    }
    return commonPrefixLength;
}