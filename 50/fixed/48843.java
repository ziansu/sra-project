public java.lang.String getYWSeqValue(java.lang.String str) {
    return com.google.common.base.CharMatcher.anyOf("ATCGUINBDHKMRSWYV").retainFrom(str.toUpperCase());
}