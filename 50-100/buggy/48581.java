static int calculateCommonPrefixLength(final java.lang.String s1, final java.lang.String s2) {
    final int minLength = java.lang.Math.min(s1.length(), s2.length());
    int commonPrefixLength = 0;
    for (int i = 0; i < minLength; ++i) {
        if ((s1.charAt(i)) != (s2.charAt(i)))
            return commonPrefixLength;
        
        ++commonPrefixLength;
    }
    return commonPrefixLength;
}