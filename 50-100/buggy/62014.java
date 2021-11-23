private java.lang.String revcomplement(java.lang.String string) {
    int l = string.length();
    char[] revString = new char[l];
    for (int i = 0; i < l; i++) {
        revString[((l - i) - 1)] = ((char) (DNAComplement.get(string.charAt(i))));
    }
    return java.lang.String.valueOf(revString);
}